package net.runelite.client.plugins.privateserver;

import com.google.inject.Inject;
import com.google.inject.Provides;
import net.runelite.api.Client;
import net.runelite.client.RuneLite;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientUI;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

@PluginDescriptor(
        name = "Private Server"
)
public class PrivateServerPlugin extends Plugin
{

    @Inject
    private Client client;

    @Inject
    private PrivateServerConfig config;

    @Provides
    PrivateServerConfig getConfig(ConfigManager configManager)
    {
        return configManager.getConfig(PrivateServerConfig.class);
    }

    @Override
    protected void startUp()
    {
        if(!config.modulus().equals(""))
        {
            client.setModulus(new BigInteger(config.modulus(), 16));
        }
    }

    @Override
    protected void shutDown()
    {
        client.setModulus(null);
    }

    @Subscribe
    private void onConfigChanged(ConfigChanged event)
    {
        if(!event.getGroup().equals("privateserver"))
        {
            return;
        }

        if(event.getKey().equals("modulus"))
        {
            if(!config.modulus().equals(""))
            {
                client.setModulus(new BigInteger(config.modulus(), 16));
            }
        }
        else if(event.getKey().equals("codebase"))
        {
            writeStringToFile(RuneLite.RUNELITE_DIR + "/codebase", config.codebase());
            String message = "Please restart the client to apply the codebase changes.\n";
            JOptionPane.showMessageDialog(ClientUI.getFrame(), message, "Restart Required", JOptionPane.WARNING_MESSAGE);
        }
    }

    private static void writeStringToFile(String file, String string)
    {
        File f = new File(file);
        if(!f.exists())
        {
            try
            {
                f.createNewFile();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        try(PrintWriter out = new PrintWriter(file)) {
            out.println(string);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
