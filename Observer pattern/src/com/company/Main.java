package com.company;

import com.company.observer.Observer;
import com.company.subject.Subject;

public class Main {

    public static void main(String[] args) {
        Subject subject=new Subject();
        Observer ob1=new Observer("Yerkuat Kyndybaiuly");
        System.out.println(subject.addObserver(ob1));
        Observer ob2=new Observer("Yeskendir Djaksylykov");
        System.out.println(subject.addObserver(ob2));
        subject.addTitle("Так же, как и Чемпионат мира по футболу, каждые четыре года проводится ЧМ по футзалу. В этом году принимает Литва. \n" +
                "\n" +
                "Так вот. Ребята на фото, то есть сборная KZ, ночью совершили историю. Пробились в полуфинал. Проигрывая Ирану 0:2, они сделали камбэк и выиграли. Со счетом 3:2. Это настолько круто, что даже Президент об этом твитнул.\n" +
                "\n" +
                "За выход в финал наши поборются с Португалией, 30 сентября. А за кубок (бұйырса) - с Аргентиной или Бразилией.\n" +
                "\n" +
                "Есть в Казахстане футбол, только мини.");
        subject.addTitle("Попытались узнать, как быть полностью вакцинированным, когда у них закончится годовой абонемент на зеленый статус в Ashyq.\n" +
                "\n" +
                "В общем, Минздрав пока что сам без понятия, когда проводить ревакцинацию. Создали рабочую группу, обсуждают с ВОЗ и другими экспертами.\n" +
                "\n" +
                "Цой пообещал, что в ближайшее время они решат и дадут знать.");
        subject.addTitle("Так был убит 41-летний фермер в Сатпаеве. Во дворе своего дома. В ночь на 20 августа. Предположительно, киллером.\n" +
                "\n" +
                "Бауржан Жакупов закрывал ворота, когда подошел неизвестный в черном. Сатпаевец попытался спрятаться от мужчины (вооруженного) за калиткой, а затем бросился к дому. Но тот догнал его и расстрелял. Пустил в него 6 пуль, после чего, достав нож, ударил в грудь и шею.\n" +
                "\n" +
                "Есть версия, что это дело рук преступной группировки. Однако, по словам близких, Бауржан ни с кем не имел конфликтов и в целом был мирным человеком. \n" +
                "\n" +
                "Друзья жертвы связались с коллегами из @patriot_patriot и пообещали денежную награду. За информацию, которая поможет полиции найти убийцу или заказчика. Просят звонить на 102.");


    }
}
