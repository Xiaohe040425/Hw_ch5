class page55 {
    public static void main(String[] args) {
    	P55Company cmp = new P55Company();
    	P55Driver drv1 = new P55Driver(cmp);
        drv1.start();

        P55Driver drv2 = new P55Driver(cmp);
        drv2.start();
    }
}

class P55Company {
    private int sum = 0;

    public synchronized void add(int a) {
        int tmp = sum;
        System.out.println("目前的合計金額是 " + tmp + " 元");
        System.out.println("賺到 " + a + " 元了。");
        tmp = tmp + a;
        System.out.println("合計金額是 " + tmp + " 元");
        sum = tmp;
    }
}

class P55Driver extends Thread {
    private P55Company comp;

    public P55Driver(P55Company c) {
        comp = c;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            comp.add(50);
        }
    }
}
