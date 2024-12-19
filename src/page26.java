class page26 {
    public static void main(String[] args) {
    	try {
    		int[] test = new int[5];
    	    System.out.println("將值指定給test[10]");
    	    
    	    test[10] = 80;
    	    System.out.println("將80指定給test[10]");
    	}
    	
    	catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("超出陣列範圍");
    		System.out.println("發生了" + e + "這個例外");
    	}
    	finally {
    		System.out.println("最後一定執行");
    	}
    	System.out.println("順利執行完畢");
    }
}

