import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class67 {
	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("i")
	static final BigInteger field840;
	@ObfuscatedName("w")
	static final BigInteger field843;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1442166637
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1013200423
	)
	public static int field845;

	static {
		field840 = new BigInteger("10001", 16); // L: 6
		field843 = new BigInteger("84e7763d46b11918514a29fa9fcdd393222c083de723c45e4d7c5fa7aeeca9d782aafbf4d0008d6532ebe7449013e78bdf722a2eba5b66b0c5bbedde0aad5c24cabf90ffc22cc94860a8d5a3e8eb9012bd814048584a42ac43cd94c91b0f5b0f5f459493fc7fb42ee4a46f47de978d68165eca709f62c5dfa3dd299236da5e8f69e54cd2bcd22d3312d2bf9ca513c3607bd97ba54d7a57cf698ffbcc64666c46c83f137b03dac3df82c8f7246d2deac68b68d5f10881fb358394ecca904cc3bf033caadc194a9583a3b74eb32a49d9e2bbd71caadd06ea297c34584d75f68b5cc52e40eec72a11e5e5776dc3072a94dc46de2f9244bff073e2e6a0f30cb4e6e5", 16); // L: 7
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-782668076"
	)
	static int method1914(int var0, Script var1, boolean var2) {
		if (var0 == 7100) { // L: 4385
			++class14.Interpreter_intStackSize; // L: 4386
			return 1; // L: 4387
		} else if (var0 == 7101) { // L: 4389
			class295.Interpreter_stringStackSize += 2; // L: 4390
			return 1; // L: 4391
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) { // L: 4393
			if (var0 == 7106) { // L: 4397
				++class14.Interpreter_intStackSize; // L: 4398
				return 1; // L: 4399
			} else if (var0 == 7107) { // L: 4401
				++class14.Interpreter_intStackSize; // L: 4402
				return 1; // L: 4403
			} else if (var0 == 7108) { // L: 4405
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Language.method5521() ? 1 : 0; // L: 4406
				return 1; // L: 4407
			} else if (var0 == 7110) { // L: 4409
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 4410
				return 1; // L: 4411
			} else if (var0 == 7120) { // L: 4413
				--class14.Interpreter_intStackSize; // L: 4414
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 4415
				return 1; // L: 4416
			} else if (var0 == 7121) { // L: 4418
				class14.Interpreter_intStackSize -= 2; // L: 4419
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4420
				return 1; // L: 4421
			} else if (var0 == 7122) { // L: 4423
				class14.Interpreter_intStackSize -= 2; // L: 4424
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 4425
				return 1; // L: 4426
			} else {
				return 2; // L: 4428
			}
		} else {
			++class14.Interpreter_intStackSize; // L: 4394
			return 1; // L: 4395
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "621915998"
	)
	static final void method1913(int var0) {
		if (var0 >= 0) { // L: 8261
			int var1 = Client.menuArguments1[var0]; // L: 8262
			int var2 = Client.menuArguments2[var0]; // L: 8263
			int var3 = Client.menuOpcodes[var0]; // L: 8264
			int var4 = Client.menuIdentifiers[var0]; // L: 8265
			String var5 = Client.menuActions[var0]; // L: 8266
			String var6 = Client.menuTargets[var0]; // L: 8267
			class14.menuAction(var1, var2, var3, var4, var5, var6, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8268
		}
	} // L: 8269
}
