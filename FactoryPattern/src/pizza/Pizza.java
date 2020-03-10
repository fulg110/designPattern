package pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pizza {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void prepare(String name) {
        System.out.println(" 开始准备食材 "+name);
    }

    public void bake() {
        System.out.println(" 开始准备烘焙bake（）");
    }

    public void box() {
        System.out.println(" 开始准备打包box（）");
    }

}

class ChessePizza extends Pizza {
    @Override
    public void prepare(String name) {
        System.out.println("开始制作ChessePizza");
    }
}

class GreekPizza extends Pizza {
    @Override
    public void prepare(String name) {
        System.out.println("开始制作GreekPizza");
    }
}

class ChinaPizza extends Pizza {
    @Override
    public void prepare(String name) {
        System.out.println("开始制作ChinaPizza");
    }
}

class OrderType {

    OrderType(){
        createPizza();
    }

    public Pizza createPizza() {
        Pizza pizza = null;
        do {
            String name = getName();
            if ("china".equals(name)){
                pizza = new ChinaPizza();
                pizza.setName("china");
            }else if ("chesse".equals(name))
            {
                pizza = new ChessePizza();
                pizza.setName("chesse");
            }else if ("Greek".equals(name)){
                pizza = new GreekPizza();
                pizza.setName("Greek");
            }else{
                break;
            }
            pizza.prepare(name);
            pizza.bake();
            pizza.box();
        }while (true) ;
        return pizza;
    }

    public String getName() {
        System.out.println("ReadTest, Please Enter Data:");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String name = null;
        try {
            name = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return name;
    }
}

class OrderPizzaClient{
    public static void main(String[] args) {
        new OrderType();

    }
}
