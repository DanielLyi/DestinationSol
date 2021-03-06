/*
 * Copyright 2019 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.destinationsol.game.console;

public class Message {

    private final MessageType type;
    private final String message;

    public Message(String message) {
        this.message = message;
        this.type = CoreMessageType.INFO;
    }

    public Message(String message, MessageType type) {
        this.message = message;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public MessageType getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("[%s] '%s'", type, message);
    }

    public static Message SUCCESS(String status) {
        return new Message(status, CoreMessageType.INFO);
    }

    public static Message FAILURE(String status) {
        return new Message(status, CoreMessageType.ERROR);
    }

    public static Message WARN(String status) {
        return new Message(status, CoreMessageType.WARN);
    }
}
