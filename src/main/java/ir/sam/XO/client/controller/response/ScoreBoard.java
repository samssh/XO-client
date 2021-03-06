package ir.sam.XO.client.controller.response;

import ir.sam.XO.client.controller.ResponseVisitor;

import java.util.ArrayList;
import java.util.Map;

public class ScoreBoard extends Response {
    private final ArrayList<Map<String, Object>> players;
    private final Map<String,Object> currentPlayer;

    @SuppressWarnings("unchecked")
    public ScoreBoard(Map<String ,Object> map) {
        super(map);
        this.players = (ArrayList<Map<String, Object>>) map.get("players");
        this.currentPlayer = (Map<String, Object>) map.get("currentPlayer");
    }

    @Override
    public void execute(ResponseVisitor responseVisitor) {
        responseVisitor.setScoreBoard(players,currentPlayer);
    }
}
