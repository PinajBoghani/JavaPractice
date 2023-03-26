public class ClassWhatsapp implements Whatssapp{
    @Override
    public void audiocall() {
        System.out.println("Audio call");
    }

    @Override
    public void videocall() {
        System.out.println("Video call");
    }

    @Override
    public void chat() {
        System.out.println("Chat");
    }

    @Override
    public void status() {
        System.out.println("Status");

    }

    public static void main(String[] args) {
        ClassWhatsapp classWhatsapp=new ClassWhatsapp();
        classWhatsapp.audiocall();
        classWhatsapp.chat();
        classWhatsapp.videocall();
        classWhatsapp.status();
    }
}
