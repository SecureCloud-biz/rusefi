package com.rusefi.config.generated;

// this file was generated automatically by rusEFI tool ConfigDefinition.jar based on (unknown script) controllers/actuators/fan_control.txt Wed Apr 12 21:32:40 UTC 2023

// by class com.rusefi.output.FileJavaFieldsConsumer
import com.rusefi.config.*;

public class FanControl {
	public static final Field CRANKING = Field.create("CRANKING", 0, FieldType.BIT, 0).setBaseOffset(984);
	public static final Field NOTRUNNING = Field.create("NOTRUNNING", 0, FieldType.BIT, 1).setBaseOffset(984);
	public static final Field DISABLEDWHILEENGINESTOPPED = Field.create("DISABLEDWHILEENGINESTOPPED", 0, FieldType.BIT, 2).setBaseOffset(984);
	public static final Field BROKENCLT = Field.create("BROKENCLT", 0, FieldType.BIT, 3).setBaseOffset(984);
	public static final Field ENABLEDFORAC = Field.create("ENABLEDFORAC", 0, FieldType.BIT, 4).setBaseOffset(984);
	public static final Field HOT = Field.create("HOT", 0, FieldType.BIT, 5).setBaseOffset(984);
	public static final Field COLD = Field.create("COLD", 0, FieldType.BIT, 6).setBaseOffset(984);
	public static final Field[] VALUES = {
	CRANKING,
	NOTRUNNING,
	DISABLEDWHILEENGINESTOPPED,
	BROKENCLT,
	ENABLEDFORAC,
	HOT,
	COLD,
	};
}
