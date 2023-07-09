public class PrintService {
    public void print(Hogwarts[] students) {
        for (int i = 0; i < students.length; i++) {
            Hogwarts hogwarts = students[i];
            System.out.println("Имя: " + hogwarts.getName() +
                    " Фамилия: " + hogwarts.getSurname() +
                    " Сила магии: " + hogwarts.getPowerOfMagic() +
                    " Расстояние трансгрессии: " + hogwarts.getTransgressionDistance());
        }
    }

    public void print(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя: " + gryffindor.getName() +
                    " Фамилия: " + gryffindor.getSurname() +
                    " Сила магии: " + gryffindor.getPowerOfMagic() +
                    " Расстояние трансгрессии: " + gryffindor.getTransgressionDistance() +
                    " Благородство: " + gryffindor.getNobility() +
                    " Честь: " + gryffindor.getHonor() +
                    " Храбрость: " + gryffindor.getBravery());
        }
    }
    public void print(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя: " + hufflepuff.getName() +
                    " Фамилия: " + hufflepuff.getSurname() +
                    " Сила магии: " + hufflepuff.getPowerOfMagic() +
                    " Расстояние трансгрессии: " + hufflepuff.getTransgressionDistance() +
                    " Трудолюбие: " + hufflepuff.getIndustriousness() +
                    " Верность: " + hufflepuff.getLoyalty() +
                    " Честность: " + hufflepuff.getHonest());
        }
    }
    public void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя: " + slytherin.getName() +
                    " Фамилия: " + slytherin.getSurname() +
                    " Сила магии: " + slytherin.getPowerOfMagic() +
                    " Расстояние трансгрессии: " + slytherin.getTransgressionDistance() +
                    " Хитрость: " + slytherin.getTrick() +
                    " Решительность: " + slytherin.getDetermination() +
                    " Амбициозность: " + slytherin.getAmbition()+
                    " Находчивость: "+ slytherin.getResourcefulness()+
                    " Жажда власти: "+ slytherin.getLustForPower());
        }

}
    public void print(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя: " + ravenclaw.getName() +
                    " Фамилия: " + ravenclaw.getSurname() +
                    " Сила магии: " + ravenclaw.getPowerOfMagic() +
                    " Расстояние трансгрессии: " + ravenclaw.getTransgressionDistance() +
                    " Ум: " + ravenclaw.getSmart() +
                    " Мудрость: " + ravenclaw.getWise() +
                    " Остроумие: " + ravenclaw.getWit()+
                    " Креативность: "+ ravenclaw.getCreativity());
        }
    }
}

