

package com.mycompany.factorybuilder;

public final class Avatar {

  private final SkinTone tone;
  private final HairType hairType;
  private final HairColor hairColor;
  private final BodyType body;
  private final FacialFeatures face;

  private Avatar(Builder builder) {
    //TODO: initialize using the builder nested class
  }

  public SkinTone getSkinTone() {
    return tone;
  }

  public HairType getHairType() {
    return hairType;
  }

  public HairColor getHairColor() {
    return hairColor;
  }

  public BodyType getBodyType() {
    return body;
  }

  public FacialFeatures getFacialFeatures() {
    return face;
  }

  @Override
  public String toString() {

    var sb = new StringBuilder();
    sb.append(tone).append(" skin color");
    if (hairColor != null || hairType != null) {
      sb.append(" with ");
      if (hairColor != null) {
        sb.append(hairColor).append(' ');
      }
      if (hairType != null) {
        sb.append(hairType).append(' ');
      }
      sb.append(hairType != HairType.BALD ? "hair" : " head");
    }
    if (body != null) {
      sb.append(" and a ").append(body).append(" body");
    }
    if (face != null) {
      sb.append(" and a ").append(face);
    }
    sb.append('.');
    return sb.toString();
  }

  /**
   * The builder class.
   */
  public static class Builder {

    private final SkinTone tone;
    private HairType hairType;
    private HairColor hairColor;
    private BodyType body;
    private FacialFeatures face;

    /**
     * Constructor.
     */
    public Builder(SkinTone tone) {
      if (tone == null ) {
        throw new IllegalArgumentException("SkinTone can not be null");
      }
      this.tone = tone;
 
    }

    
    public Builder withHairType(HairType hairType) {
    }

    // TODO: Add with withHairColor, withBodyType, withFacialFeatures
    public Avatar build() {
      
    }
  }
}
