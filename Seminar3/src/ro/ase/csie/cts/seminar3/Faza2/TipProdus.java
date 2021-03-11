package ro.ase.csie.cts.seminar3.Faza2;

public enum TipProdus {
    NOU(0),DISCOUNT(0.1f),STOC_LIMITAT(0.5f),VECHI(0.35f);

    private  float discount;

    private TipProdus(float discount){
        this.discount = discount;
    }

    public float getDiscount(){
        return this.discount;
    }
}
