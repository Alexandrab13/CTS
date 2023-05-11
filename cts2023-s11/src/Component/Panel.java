package Component;

import Component.Component;

import java.util.ArrayList;
import java.util.List;

//  componenta compozita are o lista de componente care tin minte butoanele si textele care se acorda
public class Panel implements Component {
    private List<Component> componente = new ArrayList<>();
    public void adaugaComponenta(Component componenta){
        componente.add(componenta);
    }

    public void eliminaComponenta(Component componenta){
        componente.remove(componenta);
    }
    @Override
    public void render() {
        System.out.println("Se afiseaza panoul");
        for(Component componenta : componente){
            componenta.render();
        }
    }
}
