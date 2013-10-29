package myokun.mods.elex.core;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import myokun.mods.elex.tileentity.TileEntityCondensator;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class PacketHandler implements IPacketHandler {

    @Override
    public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
        
    	switch (packet.channel) {
    	case Reference.CHANNEL_MAIN:
    		handleMainPackets(packet, player);
    		break;
    	}
    	
    }
    
    private void handleMainPackets(Packet250CustomPayload packet, Player player) {
    	
    	DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(packet.data));
    	
    	int packetId;
    	int buttonId;
    	int x;
    	int y;
    	int z;
    	
    	try {
    		packetId = inputStream.readInt();
        	
        	switch (packetId) {
        	case 0:
        		buttonId = inputStream.readInt();
        		x = inputStream.readInt();
        		y = inputStream.readInt();
        		z = inputStream.readInt();
        		
        		switch (buttonId) {
        		case 12:
            		boolean CBE;
            		boolean BD;
            		boolean IE;
            		
        			CBE = inputStream.readBoolean();
        			BD = inputStream.readBoolean();
        			IE = inputStream.readBoolean();
        			
        			sendCondensatorEnableButtonUpdate(x, y, z, CBE, BD, IE, player);
        			
        			break;
        		}
        		
        		break;
        	}
    	}
    	catch (IOException e) {
    		e.printStackTrace();
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    }
    
    private void sendCondensatorEnableButtonUpdate(int x, int y, int z, boolean CBE, boolean BD, boolean IE, Player player) {
    	
    	EntityPlayerMP playerMP;
    	EntityClientPlayerMP playerClient;
    	
    	if (player instanceof EntityClientPlayerMP) {
    		playerClient = (EntityClientPlayerMP)player;
    		TileEntity te = playerClient.worldObj.getBlockTileEntity(x, y, z);
    		
    		if (te != null) {
    			if (te instanceof TileEntityCondensator) {
    				TileEntityCondensator cstr = (TileEntityCondensator)te;
    				
    				cstr.canBeEnabled = CBE;
    				cstr.buttonDisabled = BD;
    				cstr.isEnabled = IE;
    			}
    		}
    	}
    	if (player instanceof EntityPlayerMP) {
    		playerMP = (EntityPlayerMP)player;
    		TileEntity te = playerMP.worldObj.getBlockTileEntity(x, y, z);
    		
    		if (te != null) {
    			if (te instanceof TileEntityCondensator) {
    				TileEntityCondensator cstr = (TileEntityCondensator)te;
    				
    				cstr.canBeEnabled = CBE;
    				cstr.buttonDisabled = BD;
    				cstr.isEnabled = IE;
    			}
    		}
    	}
    	
    }
    
}
