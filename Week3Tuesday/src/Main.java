import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Marketing> marketingList = new ArrayList<>();
        marketingList.add(new Marketing("Name One", "Product One", 1000));
        marketingList.add(new Marketing("Name Two", "Product Two", 1010));
        marketingList.add(new Marketing("Name Three", "Product Three", 1100));
        marketingList.add(new Marketing("Name Four", "Product Four", 800));
        marketingList.add(new Marketing("Name Five", "Product Five", 1500));
        marketingList.remove(1);

        System.out.println("size: " + marketingList.size());

        System.out.println("Before sorting");
        System.out.println(marketingList);
        marketingList.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return Double.compare(o1.getSalesAmount(), o2.getSalesAmount());
            }
        });
        System.out.println("After sorting in natural order");
        System.out.println(marketingList);

        List<Marketing> moreThan1000SaleAmountList = listMoreThan1000(marketingList);
        moreThan1000SaleAmountList.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                return Double.compare(m1.getSalesAmount(), m2.getSalesAmount()) + m1.getEmployeeName().compareToIgnoreCase(m2.getEmployeeName());
            }
        });
        System.out.println("After sorting with employee name and sale amount");
        System.out.println(moreThan1000SaleAmountList);
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> resultList = new ArrayList<>();
        for (Marketing m : list) {
            if (m.getSalesAmount() > 1000.00) {
                resultList.add(m);
            }
        }
        return resultList;
    }
}