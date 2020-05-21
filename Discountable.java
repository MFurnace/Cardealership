interface Discountable {
    //In interface, methods are by default public & abstract
    // so those keywords are not needed
    public abstract float getMaximumDiscountPct();

    float getPersonDiscount();
    
    
    float getCorporateDiscount();
}
