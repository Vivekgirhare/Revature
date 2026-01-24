package jan23;

class ThreadTask extends Thread {

    String[] words;

    ThreadTask(String[] words) {
        this.words = words;
    }

    public void run() {
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            for (int j = 0; j < s.length(); j++) {
                System.out.println(Thread.currentThread().getName() + " : " + s.charAt(j));
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class ThreadDemoo {

    public static void main(String[] args) {

//        String[] arr1 = {"JAVA", "THREAD"};
        String[] arr2 = {"HELLO", "WORLD"};

//        ThreadTask t1 = new ThreadTask(arr1);
        ThreadTask t2 = new ThreadTask(arr2);

//        t1.setName("Thread-1");
//        t2.setName("");

//        t1.start();
        t2.start();
    }
}

