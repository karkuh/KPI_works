public class MyFile {

    public String Name;
    public float Size;
    public String Date;
    public String Format;

    public MyFile(String name, float size, String date, String format) {
        Name = name;
        Size = size;
        Date = date;
        Format = format;
    }

    @Override
    public String toString() {
        return "|" + String.format("%-9s", getName()) + "|     |" + getDate() + "|     |" + String.format(".%-5s", getFormat()) + "|     |" + String.format("%-4.1f", getSize()) + "|\n";
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getSize() {
        return Size;
    }

    public void setSize(float size) {
        Size = size;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }
}
