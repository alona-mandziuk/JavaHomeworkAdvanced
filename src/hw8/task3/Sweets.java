package hw8.task3;

class Sweets {
    String sweet;
    boolean onPlate = true;

    Sweets(String sweet) {
        this.sweet = sweet;
    }

    synchronized void eat(Kids kid) throws InterruptedException {
        if (onPlate) {
            Thread.sleep(1500);
            onPlate = false;
            System.out.println("Kid " + kid.kidName + " ate " + this.sweet);
        }
    }
}

class Kids extends Thread {
    String kidName;
    Sweets[] sweets;

    Kids(String kidName, Sweets[] sweets) {
        this.kidName = kidName;
        this.sweets = sweets;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < sweets.length; i++) {
            try {
                sweets[i].eat(this);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class EatingCandies {
    public static void main(String[] args) {
        Sweets[] sweets = {new Sweets("Cookie"),
                new Sweets("Candie"), new Sweets("Chocolate"),
                new Sweets("Cake"), new Sweets("Waffles")};
        Kids kid1 = new Kids("Bob", sweets);
        Kids kid2 = new Kids("Mark", sweets);
        Kids kid3 = new Kids("Andrew", sweets);
        Kids kid4 = new Kids("Ammy", sweets);
        Kids kid5 = new Kids("Katy", sweets);

        kid1.start();
        kid2.start();
        kid3.start();
        kid4.start();
        kid5.start();
    }
}