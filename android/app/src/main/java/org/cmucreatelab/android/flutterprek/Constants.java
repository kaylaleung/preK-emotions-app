package org.cmucreatelab.android.flutterprek;

import org.cmucreatelab.android.flutterprek.bluetooth_birdbrain.UARTSettings;

import java.util.UUID;

public class Constants {

    public static final String LOG_TAG = "flutterprek";

    /** This file is defined in the assets/ directory. */
    public static final String DATABASE_SEED = "etc/pilots/1/DbSeedPilot1.json";

    /** Determines if the flower activity should display the debug window (shows BLE name and last message received). */
    public static final boolean FLOWER_SHOW_DEBUG_WINDOW = false;

    public static final UARTSettings FLOWER_UART_SETTINGS;

    static {
        FLOWER_UART_SETTINGS = new UARTSettings.Builder()
                .setUARTServiceUUID(UUID.fromString("6E400001-B5A3-F393-E0A9-E50E24DCCA9E"))
                .setRxCharacteristicUUID(UUID.fromString("6E400003-B5A3-F393-E0A9-E50E24DCCA9E"))
                .setTxCharacteristicUUID(UUID.fromString("6E400002-B5A3-F393-E0A9-E50E24DCCA9E"))
                .setRxConfigUUID(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"))
                .build();
    }

    public static final DeviceConnectionHandler.HardcodedValues
            STATION_TEST = new DeviceConnectionHandler.HardcodedValues("test","FLOWER-AEF3D",null, null, null),
            STATION_1 = new DeviceConnectionHandler.HardcodedValues("heart","FLOWER-9B4BC","MNSQ1","MNWD1","MNYG1"),
            STATION_2 = new DeviceConnectionHandler.HardcodedValues("star","FLOWER-9C915","MNSQ2","MNWD2","MNYG2");

    /**
     * Set this to use hardcoded values for the MindfulNest BLE devices.
     * This is helpful when there are multiple stations in the same room.
     */
    public static final DeviceConnectionHandler.HardcodedValues HARDCODED_VALUES = null;

}
