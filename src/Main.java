public class Main {
    public static void main(String[] args) {
        Gryffindor g_hp = new Gryffindor("Гарри Поттер", 86, 56, 7, 9, 9);
        Gryffindor g_gg = new Gryffindor("Гермиона Грейнджер", 89, 67, 5, 7, 8);
        Gryffindor g_rw = new Gryffindor("Рон Уизли", 79, 58, 8, 7, 10);
        Slitherine s_dm = new Slitherine("Драко Малфой", 85, 60, 8, 7, 10, 8, 10);
        Slitherine s_gm = new Slitherine("Грэхэм Монтегю", 70, 70, 7, 8, 8, 6, 7);
        Slitherine s_gg = new Slitherine("Грегори Гойл", 52, 40, 5, 6, 7, 4, 6);
        Hufflepuff h_zs = new Hufflepuff("Захария Смит", 66, 60, 8,7,9);
        Hufflepuff h_sd = new Hufflepuff("Седрик Диггори", 70, 70, 9,6,8);
        Hufflepuff h_jf = new Hufflepuff("Джастин Финч-Флетчли", 66, 60, 8,7,9);
        Ravenclaw r_cc = new Ravenclaw("Чжоу Чанг", 77, 69, 8,9,7);
        Ravenclaw r_pp = new Ravenclaw("Падма Патил", 80, 65, 9,10,10);
        Ravenclaw r_mb = new Ravenclaw("Маркус Белби", 70, 80, 10,8,8);
        g_hp.data();
        g_hp.compareSchoolStudents(s_dm);
        g_hp.compareFacultyStudents(g_rw);
    }
}