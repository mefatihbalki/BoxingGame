public class Fighter {
    String name;
    int damage;
    int heatlh;
    int weight;
    int dodge;
    int firstHit;

    //Dvüşçülerin değerleri
    Fighter(String name, int damage, int heatlh, int weight, int dodge, int firstHit){
        this.name = name;
        this.damage = damage;
        this.heatlh = heatlh;
        this.weight = weight;

        //Round Başı ilk atağı yapacak kişi ihtimali
        if (firstHit >= 0 && firstHit <=100) {
            this.firstHit = firstHit;
        }else{
            this.firstHit = 0;
        }
        //Dodge İhtimali
        if (dodge >= 0 && dodge <=100) {
            this.dodge = dodge;
        }else{
            this.dodge = 0;
        }
    }

    //ilk vuruş ve dodge ihtimallerinin can üzerinden return döngüsü
    int hit (Fighter foe){
        if (foe.isfirstHit()){
            System.out.println(foe.name + " İlk Vuruşu Yaptı");
            return foe.heatlh;
        }
        System.out.println(this.name + "=>" + foe.name + " " + this.damage + " Hasar Vurdu");
        if (foe.isdodge()){
            System.out.println(foe.name + " Atağı Blokladı");
            System.out.println("------------------");
            return foe.heatlh;
        }
        if (foe.heatlh - this.damage < 0){
            return 0;
        }
        return foe.heatlh - this.damage;
    }

    //dodge boolean
    boolean isdodge(){
        double ramdomNumber = Math.random() * 100;
        return ramdomNumber <= this.dodge;

    }

    //ilk vuruş booelan
    boolean isfirstHit() {
        double ramdomNumber = Math.random() * 100;
        return ramdomNumber <= this.firstHit;
    }

}
