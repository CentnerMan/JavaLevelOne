package ru.lebedev.se.chat.client.command;

import ru.lebedev.se.chat.server.api.ChatService;
import ru.lebedev.se.chat.server.model.Session;

import java.util.Scanner;

public class ClientCommandContactRemove extends AbstractClientCommand {

    public ClientCommandContactRemove(ChatService chatService, Session session, Scanner scanner) {
        super(chatService, session, scanner);
    }

    @Override
    public void execute() {
        if (session == null) return;
        System.out.println("ENTER LOGIN: ");
        final String login = scanner.nextLine();
        chatService.removeContact(session, login);
    }
}
