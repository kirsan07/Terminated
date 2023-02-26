class ThreadUtil extends Tread {
    static void printNameOfTerminatedThread(Tread[] threads) {
        // implement the method
        for (int i = 0; i < threads.length; i++) {
            if ("TERMINATED".equals(threads[i].toString())){
                System.out.println("\n" + threads[i].getName() + ": " +  threads[i].getState());
            }
        }
    }
}

