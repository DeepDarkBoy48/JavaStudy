public class Homework9X {
    public static void main(String[] args) {
        Music music = new Music("robin", 300);
        music.play();
        System.out.println(music.getInfo());
    }
}

class Music {
    String name;
    int times;

    public Music(String name, int times) {
        this.name = name;
        this.times = times;
    }

    public void play() {
        System.out.println("music " + name + " is playing---duration is" + times + "s");
    }

    public String getInfo() {
        return "music:" + name + " time is:" + times;
    }
}
