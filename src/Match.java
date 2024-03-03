public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    //Dövüşçü değerleri
    Match(Fighter f1,Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    //Round Sistemi / Ağırlık kontrolü
    public void fight(){
        if (isCheck()){
            while (this.f1.heatlh > 0 && this.f2.heatlh > 0){
                System.out.println("******Yeni Round******");
                this.f2.heatlh = this.f1.hit(this.f2);
                if(isWin()){
                    break;
                }

                this.f1.heatlh = this.f2.hit(this.f1);

                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name + "Sağlık: " + this.f1.heatlh );
                System.out.println(this.f2.name + "Sağlık: " + this.f2.heatlh );
            }
        }else{
            System.out.println("Sporcuların Sikletleri Doğru Eşleşmede Değil!");
        }
    }

    //Ağırlık Kontrol
    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <=maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <=maxWeight);
    }

    //Kazanan sonucu
    boolean isWin (){
        if (this.f1.heatlh ==0){
            System.out.println(this.f2.name + " Kazandı!!!");
            return true;
        }
        if (this.f2.heatlh ==0){
            System.out.println(this.f1.name + " Kazandı!!!");
            return true;
        }
        return false;
    }

}
