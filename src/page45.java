class page45 {
    public static void main(String[] args) {
        P45Car car1 = new P45Car("1號車");
        car1.start();
        P45Car car2 = new P45Car("2號車");
        car2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("正在進行main()的處理工作");
        }
    }
}

class P45Car extends Thread {
    private String name;

    public P45Car(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("正在進行" + name + "的處理工作");
        }
    }
}
