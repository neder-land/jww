package com.github.neder_land.jww.packet;

import com.github.neder_land.jww.packet.content.*;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public abstract class Decoder {

    public void decode(String json) {
        JsonElement element = JsonParser.parseString(json);
        String action = element.getAsJsonObject().get("action").getAsString();
        switch (action) {
            case Packets.BREAK_FAIL:
                handleBreakFail(Packet.<ReasonContent>deserialize(element).getContent());
                break;
            case Packets.CREATE:
                handleCreate(Packet.<RoomCreationContent>deserialize(element).getContent());
                break;
            case Packets.CREATE_FAIL:
                handleCreateFail(Packet.<ReasonContent>deserialize(element).getContent());
                break;
            case Packets.CREATE_SUCCESS:
                handleCreateSuccess(Packet.<RoomCreationContent>deserialize(element).getContent());
                break;
            case Packets.DISCONNECT:
                handleDisconnect();
                break;
            case Packets.JOIN:
                handleJoin(Packet.<RoomNameContent>deserialize(element).getContent());
                break;
            case Packets.JOIN_FAIL:
                handleJoinFail(Packet.<ReasonContent>deserialize(element).getContent());
                break;
            case Packets.JOIN_SUCCESS:
                handleJoinSuccess(Packet.<DetailedRoomContent>deserialize(element).getContent());
                break;
            case Packets.LEAVE_FAIL:
                handleLeaveFail(Packet.<ReasonContent>deserialize(element).getContent());
                break;
            case Packets.LIST_ROOM_RESPONSE:
                handleListRoomResponse(Packet.<RoomListContent>deserialize(element).getContent());
                break;
            case Packets.LIST_ROOMS:
                handleListRooms(Packet.<GameTypeContent>deserialize(element).getContent());
                break;
            case Packets.LIST_TYPE_RESPONSE:
                handleListTypeResponse(Packet.<GameTypeListContent>deserialize(element).getContent());
                break;
            case Packets.LIST_TYPES:
                handleListTypes();
                break;
            case Packets.LOGIN:
                handleLogin(Packet.<UsernameContent>deserialize(element).getContent());
                break;
            case Packets.LOGIN_CANCEL:
                handleLoginCancel(Packet.<ReasonContent>deserialize(element).getContent());
                break;
            case Packets.LOGOUT:
                handleLogout();
                break;
            case Packets.ROOM_OPERATION:
                handleRoomOperation(Packet.<RoomOperationContent>deserialize(element).getContent());
                break;
            case Packets.ROOM_STATUS_CHANGE:
                handleRoomStatusChange(Packet.<RoomStatusContent>deserialize(element).getContent());
                break;
            case Packets.USER_ACTION:
                handleUserAction(Packet.<UserActionContent>deserialize(element).getContent());
                break;
            case Packets.USER_OPERATION:
                handleUserOperation(Packet.<UserOperationContent>deserialize(element).getContent());
                break;
            case Packets.USER_STATUS_CHANGE:
                handleUserStatusChange(Packet.<UserStatusContent>deserialize(element).getContent());
                break;
            default:
                extraDecode(action, element);
        }
    }

    protected abstract void extraDecode(String action, JsonElement json);

    protected void handleBreakFail(ReasonContent content) {
    }

    protected void handleCreate(RoomCreationContent content) {
    }

    protected void handleCreateFail(ReasonContent content) {
    }

    protected void handleCreateSuccess(RoomCreationContent content) {
    }

    protected void handleDisconnect() {
    }

    protected void handleJoin(RoomNameContent content) {
    }

    protected void handleJoinFail(ReasonContent content) {
    }

    protected void handleJoinSuccess(DetailedRoomContent content) {
    }

    protected void handleLeaveFail(ReasonContent content) {
    }

    protected void handleListRoomResponse(RoomListContent content) {
    }

    protected void handleListRooms(GameTypeContent content) {
    }

    protected void handleListTypeResponse(GameTypeListContent content) {
    }

    protected void handleListTypes() {
    }

    protected void handleLogin(UsernameContent content) {
    }

    protected void handleLoginCancel(ReasonContent content) {
    }

    protected void handleLogout() {
    }

    protected void handleRoomOperation(RoomOperationContent content) {
    }

    protected void handleRoomStatusChange(RoomStatusContent content) {
    }

    protected void handleUserAction(UserActionContent content) {
    }

    protected void handleUserOperation(UserOperationContent content) {
    }

    protected void handleUserStatusChange(UserStatusContent content) {
    }

}
