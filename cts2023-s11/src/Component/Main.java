package Component;

import Component.Component;

//codul client
public class Main {
    public static void main(String[] args) {
        //creeaza componentele
        Component buton1 = new Button();
        Component buton2 = new Button();
        Component campText = new TextField();

        //creeaza un panou si adauga componente
        Component panou = new Panel(); /// in loc de component e panel pentru eroare sau a doua var de rezolvare facem cast
        ((Panel) panou).adaugaComponenta(buton1);
        ((Panel) panou).adaugaComponenta(buton2);
        ((Panel) panou).adaugaComponenta(campText);

        //afiseaza panoul si componentele sale
        panou.render();

    }
}
