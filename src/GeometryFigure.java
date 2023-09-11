import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class GeometryFigure {

    static private List<IShape> toolbox;

    public GeometryFigure() {
        toolbox = new ArrayList<IShape>();
    }

    //Меетод для удаления фигуры
    public void remove(int num) {
        toolbox.remove(num);
    }
    //Метод для добавления новой фигуры
    public void add(IShape figure){
        toolbox.add(figure);
    }

    //Метод поиска необходимой фигуры
    public IShape find(int num){
        return toolbox.get(num);
    }
    //Метод для получения количества фигур в списке
    public int count(){
        return toolbox.size();
    }
    //Метод отображения информации о фигуре
    public void getInfo (int num) {

        if (num >=0 && num < toolbox.size()) {
            IShape figure = toolbox.get(num);
            System.out.println(figure.getClass().getCanonicalName() + "   " + "Площадь: " + figure.getArea() + ", Периметр: " + figure.getPerimeter());
        } else {
            System.out.println("Неверный индекс");
        }
        }
    }

