package net.runelite.client.plugins.privateserver;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("privateserver")
public interface PrivateServerConfig extends Config
{

    @ConfigItem(
            keyName = "codebase",
            name = "Codebase",
            description = "The IP address in the format of 'http://<ip-address>' to connect to.",
            position = 0
    )
    default String codebase()
    {
        return "http://127.0.0.1";
    }

    @ConfigItem(
            keyName = "modulus",
            name = "RSA Public Modulus",
            description = "The RSA public modulus required to connect to the server.",
            position = 1
    )
    default String modulus()
    {
        return "ba6f4d5a8146e1aa1a4fc9e54beadea5f53dd1942800c94d3e2c042982a199fed96051353d9f9a71ace0ef63fe31f14d94c4c8df02718eed330e04ba689531a161a8ac3a4f411bedbb039929a9104c9c87932796fef1177c1e3cdb0883330c0943a22866b62da2b81f89aa8563efd2d21fde39cd247fb826f51518d1e35456d198bb08f424a792eeec7e262ea51010fb17000b4e2afcb07dbad6e1c94dc7b2250c955370809d250681720a647356c4bdcc5e76c36c65f6e453ef7bbe9ad3dfc7b116ae1ca7070ffea0f40113146af1666c47144595ce07ba408d4e03a5aaf3ac443186e1a65874d511c68e45e5e13e9d585a86f6c326083c537d0aaf1e26c871";
    }
}
