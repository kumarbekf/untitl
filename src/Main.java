public class Main {
    public static void main(String[] args) {
   Papugai ed = new Papugai();
        System.out.println("ПАПУГАЙ");
   ed.setUzundugu1(4.5);
   ed.setTusu1("кок ак сары");
   ed.setNeim("суйлойт");
        System.out.println("узундугу :"+ed.getUzundugu());
        System.out.println("тусу :"+ed.getTusu1());
        System.out.println(ed.getЯзык());
Balyk ws = new Balyk();
        System.out.println("БАЛЫК");
ws.setUzundugu(1);
        ws.setSalmagy(1.14);
        ws.setColor(50);
        System.out.println("узундугу :"+ws.getUzundugu()+" метр болот");
        System.out.println("салмагы : "+ws.getSalmagy()+" тон жетет");
        System.out.println(ws.getColor()+" километр сузот");
        Kat kat = new Kat();
        System.out.println("МЫШЫК");
        kat.setNeim("жей");
        kat.setTusu2("ак");
        kat.setYldamdygy(13.8);
        System.out.println("аты :"+kat.getNeim());
        System.out.println("Tусу :"+kat.getTusu2());
        System.out.println(kat.getYldamdygy());
    Dog as=new Dog();
        System.out.println("ИТ");
        as.setName("bobik");
        as.setAge(8);
        as.setYldamdygy(15.2);
        System.out.println(as.getName());
        System.out.println(as.getAge()+" jash ");
        System.out.println(as.getYldamdygy());
    }
}