package br.com.zgsolucoes;

public class Van {

    private int velocity = 0;
    private int acceleration = 0;

    private int maxDeceleration;
    private int maxAcceleration;
    private int time;
    private int qtdChecks;
    private int lengthRoute;

    private int startCheck;
    private int minSpeed;
    private int maxSpeed;

    public void start(int n, int l, int a, int d) throws Exception {
        setQtdChecks(n);
        setLengthRoute(l);
        setMaxAcceleration(a);
        setMaxDeceleration(d);
    }

    public void checkPoints(int x, int v, int w) {
        setStartCheck(x);
        setMinSpeed(v);
        setMaxSpeed(w);
        time = getVelocity() + getAcceleration();
        System.out.println(time);
    }

    private Boolean validateEnd(Integer[] values) {
        for (int value : values) {
            if (value == -1) {
                return false;
            }
        }
        return true;
    }

    public void validateVelocity(Integer[] args) {
        try {
            if (args.length == 4) {
                if (validateEnd(args)) {
                    start(args[0], args[1], args[2], args[3]);
                } else {
                    //  System.exit(0);
                }
            } else {
                checkPoints(args[0], args[1], args[2]);
            }
        } catch (Exception e) {
            System.out.println("*");
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 100) {
            this.maxSpeed = maxSpeed;
        } else {
            throw new NumberFormatException("Maximum speed is invalid!");
        }

    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        if (minSpeed >= 1) {
            this.minSpeed = minSpeed;
        } else {
            throw new NumberFormatException("Minimum speed is invalid!");
        }
    }

    public int getStartCheck() {
        return startCheck;
    }

    public void setStartCheck(int startCheck) {
        if (startCheck >= 1 && startCheck <= (lengthRoute - 1)) {
            this.startCheck = startCheck;
        } else {
            throw new NumberFormatException("Start check point is invalid!");
        }
    }


    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {

        this.velocity = velocity;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getMaxDeceleration() {
        return maxDeceleration;
    }

    public void setMaxDeceleration(int maxDeceleration) {
        if (maxDeceleration <= 100) {
            this.maxDeceleration = maxDeceleration;
        } else {
            throw new NumberFormatException("Maximum deceleration is invalid!");
        }

    }

    public int getMaxAcceleration() {
        return maxAcceleration;
    }

    public void setMaxAcceleration(int maxAcceleration) {
        if (maxAcceleration >= 1) {
            this.maxAcceleration = maxAcceleration;
        } else {
            throw new NumberFormatException("Maximum acceleration is invalid!");
        }
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getQtdChecks() {
        return qtdChecks;
    }

    public void setQtdChecks(int qtdChecks) throws Exception {
        if (qtdChecks <= 1000000 && qtdChecks >= 1) {
            this.qtdChecks = qtdChecks;
        } else {
            throw new NumberFormatException("Quantity Check is invalid!");
        }
    }

    public int getLengthRoute() {
        return lengthRoute;
    }

    public void setLengthRoute(int lengthRoute) {
        if (lengthRoute <= 100000000 && lengthRoute >= 2) {
            this.lengthRoute = lengthRoute;
        } else {
            throw new NumberFormatException("Length route is invalid!");
        }
    }
}
