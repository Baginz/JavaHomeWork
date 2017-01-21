package com.javarush.test.level17.lesson10.home05;

/* Лишняя синхронизация
synchronized существенно замедляет программу, поэтому убери избыточность synchronized внутри методов
*/

public class Solution {
    char[] value;
    int count;

    public Solution append(CharSequence s) {
            if (s == null) {
                    s = "null";
            }

            if (s instanceof String) {
                    return this.append((String) s);
            }

            if (s instanceof Solution) {
                    return this.appendThis((Solution) s);
        }
        return this.append(s);
    }

    public synchronized Solution appendThis(Solution s) {
        //do something here....
        return this;
    }

    private static final java.io.ObjectStreamField[] serialPersistentFields =
            {
                    new java.io.ObjectStreamField("value", char[].class),
                    new java.io.ObjectStreamField("count", Integer.TYPE),
                    new java.io.ObjectStreamField("shared", Boolean.TYPE),
            };

    private synchronized void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        java.io.ObjectOutputStream.PutField fields = s.putFields();
            fields.put("value", value);
            fields.put("count", count);
            fields.put("shared", false);
            s.writeFields();
    }

    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
            java.io.ObjectInputStream.GetField fields = s.readFields();
            value = (char[]) fields.get("value", null);
            count = fields.get("count", 0);
    }
}
/*public Solution append(CharSequence s) {
synchronized (Solution.class) {//Эту строку удалил, так как наш класс не объявлен статическим
        if (s == null) {
synchronized (this) { //Эту строку удаляем так как s внутренняя переменная и получить доступ из вне не получится
        s = "null";
        }
        }

        if (s instanceof String) {
synchronized (this) {//Эту строку удаляем так как идёт рекурсивный вызов, опять же никто извне ничего не сделает
        return this.append((String) s);
        }
        }

        if (s instanceof Solution) {
synchronized (this) {//Эту строку удаляем так как метод appendThis синхронизирован
        return this.appendThis((Solution) s);
        }
        }
        }
        return this.append(s);
        }

public synchronized Solution appendThis(Solution s) {
        //do something here....
        return this;
        }

private static final java.io.ObjectStreamField[] serialPersistentFields =
        {
        new java.io.ObjectStreamField("value", char[].class),
        new java.io.ObjectStreamField("count", Integer.TYPE),
        new java.io.ObjectStreamField("shared", Boolean.TYPE),
        };

private synchronized void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        java.io.ObjectOutputStream.PutField fields = s.putFields();
synchronized (fields) {//удаляем, так как сам метод синхронизирован и весь код в нём, и читаем внимательно условие
        fields.put("value", value);
        fields.put("count", count);
        fields.put("shared", false);
        }
synchronized (s) {//тоже самое
        s.writeFields();
        }
        }

private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
synchronized (new java.io.IOException()) {//тут у меня догадки метод - private - это раз, доступен изнутри. также в методе происходит только чтение final полей, поэтому присвоить value и count изменённых значений либо не получится, либо не возможно
        java.io.ObjectInputStream.GetField fields = s.readFields();
        value = (char[]) fields.get("value", null);
        count = fields.get("count", 0);
        }
        }*/