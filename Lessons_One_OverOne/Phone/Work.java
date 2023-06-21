package Phone;

public class Work {
    int numderWhole;
    double fraction;

    public Work(double number) {
        this.numderWhole = (int) (number / 1);
        this.fraction = (number % 1);
    }
    public double sum(Work work1, Work work2) {
        System.out.println(work1.numderWhole + work2.numderWhole + work1.fraction + work2.fraction);
        return work1.numderWhole + work2.numderWhole + work1.fraction + work2.fraction;
    }

    public void subtraction(Work workTwo) {
        System.out.println(this.numderWhole - workTwo.numderWhole + this.fraction - workTwo.fraction);
    }
    public void multiplication(Work workTwo) {
        System.out.println(this.numderWhole * workTwo.numderWhole + this.fraction * workTwo.fraction);
    }

    public boolean compare(Work work1, Work work2) {
        if (work1.numderWhole == work2.numderWhole && work1.fraction == work2.fraction) {
            return true;
        }return false;
    }

    @Override
    public String toString() {
        return "Work{" +
                "numderWhole=" + numderWhole +
                ", fraction=" + fraction +
                '}';
    }
}
