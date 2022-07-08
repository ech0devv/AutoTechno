package codes.ztereohype.autotechno;

import codes.ztereohype.autotechno.chat.EventDetector;
import codes.ztereohype.autotechno.chat.MessageRandomiser;
import codes.ztereohype.autotechno.client.ClientWrapper;
import codes.ztereohype.autotechno.config.AutoTechnoConfig;
import net.fabricmc.api.ModInitializer;

public class AutoTechno implements ModInitializer {
    public static ClientWrapper client;
    public static EventDetector detector;
    public static MessageRandomiser messageRandomiser;

    static {
        String[] startMessages = new String[]{"Good luck, and may Techno's unmatched skill be with you",
                "RIP Techno, you will be missed.",
                "Let's drop kick some children!",
                "Technoblade never dies!",
                "So, what do you guys know about anarchy?"};

        String[] killMessages = new String[]{"Blood for the Blood God",
                "In the name of techno",
                "This ones for technoblade",
                "Officer, I drop-kicked them in self defense!",
                "This is the second-worst thing to happen to these orphans.",
                "Sometimes it's tough being the best",
                "die nerd (/j)",
                "chin up king, your crown is falling"};

        String[] endMessages = new String[]{"gg e z",
                "good game",
                "Rest in Peace Technoblade",
                "Technoblade never dies",
                "so long nerds",
                "as Sun Tzu wanted"};

        AutoTechnoConfig.init(true, true, true, endMessages, startMessages, killMessages);
    }

    @Override
    public void onInitialize() {
        client = new ClientWrapper();
        detector = new EventDetector();
        messageRandomiser = new MessageRandomiser();
    }
}