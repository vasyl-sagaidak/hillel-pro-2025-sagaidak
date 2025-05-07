package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.net.Socket;
import java.time.LocalDateTime;

public class ActiveConnection implements Serializable {
    private static final long serialVersionUID = 1L;
    private String connectionName;
    private LocalDateTime connectedAt;
    private transient Socket socket;

    public ActiveConnection(Socket socket) {
        this.socket = socket;
        this.connectedAt = LocalDateTime.now();
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    public LocalDateTime getConnectedAt() {
        return connectedAt;
    }

    public void setConnectedAt(LocalDateTime connectedAt) {
        this.connectedAt = connectedAt;
    }

    @Override
    public String toString() {
        return connectionName + " (підключений о " + connectedAt + ")";
    }
}
