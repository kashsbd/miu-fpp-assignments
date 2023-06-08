package problem_three;

public class Driver {
    public static void main(String[] args) {
        Figure[] figures = {
                new UpwardHat(),
                new UpwardHat(),
                new DownwardHat(),
                new FaceMaker(),
                new Vertical()
        };
        for (Figure figure : figures) {
            figure.getFigure();
        }
        System.out.println();
        for (Figure figure : figures) {
            System.out.print(figure.getClass().getName() + " : ");
            figure.getFigure();
            System.out.println();
        }
    }
}
