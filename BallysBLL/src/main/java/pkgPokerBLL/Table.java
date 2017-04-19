package pkgPokerBLL;

import java.util.UUID;
import java.io.Serializable;
import java.util.HashMap;

public class Table implements Serializable {

	private UUID TableID;

	private HashMap<UUID,Player> TablePlayers = new HashMap<UUID,Player>();

	public Table() {
		super();
		TableID = UUID.randomUUID();
	}
	
	public HashMap<UUID, Player> getTablePlayers(){
		return TablePlayers;
	}

	public Table AddPlayerToTable(Player p) {
		TablePlayers.put(p.getPlayerID(),p);
		return this;
	}

	public Table RemovePlayerFromTable(Player p) {
		TablePlayers.remove(p.getPlayerID());
		return this;
	}
}
