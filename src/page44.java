class page44 {
    public static void main(String[] args) {
        P44Car car1 = new P44Car("1號車");
        car1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("正在進行main()的處理工作");
        }
    }
}

class P44Car extends Thread {
    private String name;

    public P44Car(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("正在進行" + name + "的處理工作");
        }
    }
}
