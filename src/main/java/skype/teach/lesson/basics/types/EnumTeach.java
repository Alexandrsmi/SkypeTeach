package skype.teach.lesson.basics.types;

/**
 *
 */
public enum
EnumTeach {
    JANUARY("Ja"),// public static final EnumTeach JANUARY = new EnumTeach("Ja");
    FEBRUARY("Feb"),
    MARCH("Ma"){
        @Override
        public void print() {
            super.print();
            System.out.println("Spring");
        }
    };

    private String shortName;

    EnumTeach(String shortName){
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public void print(){
        System.out.println(ordinal() +  ":" + shortName);
    }

    public static EnumTeach getByName(String name){
        EnumTeach[] values = EnumTeach.values();
        for (EnumTeach value: values){
            if (value.name().equals(name)){
                return value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        EnumTeach month = EnumTeach.FEBRUARY;
        System.out.println(month.name());
        System.out.println(month.ordinal());
        System.out.println(month.getShortName());
        month.print();
        month = EnumTeach.getByName("JANUARY");
        month.print();
    }
}
