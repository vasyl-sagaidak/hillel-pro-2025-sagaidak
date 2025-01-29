package lesson_10_Java_IO.livecoding;

import java.io.File;
import java.io.IOException;

public class JavaIOMain {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        file.createNewFile();

        //1 READ FILE WITH INPUT STREAM VIA TRY-CATCH-FINALLY
//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream(file);
//            int i;
//            while ((i = fis.read()) !=-1) {
//                System.out.println((char) i);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (fis != null) {
//                fis.close();
//            }
//        }

        //2 READ FILE WITH INPUT STREAM VIA TRY-WITH-RESOURCES
//        try (FileInputStream fis = new FileInputStream(file)) {
//            int i;
//            while ((i = fis.read()) != -1) {
//                System.out.println((char) i);
//            }
//        } catch(IOException e){
//                throw new RuntimeException(e);
//        }

        //3 Чтение файла при помощи FileReader что позволяет нам работать с символами а не с байтами.
        // Если мы хотим работать с бинарниками (например: загрузить картинку в базу) тогда используем
        // стримы, а если с символами то лучше ридеры.
//        try (FileReader reader = new FileReader(file)) {
//            int i;
//            while ((i = reader.read()) != -1) {
//                System.out.println((char) i);
//            }
//        } catch(IOException e){
//            throw new RuntimeException(e);
//        }

        //4 Для лучшей оптимизации вместо файлРидера используем буффередРидер.
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            int i;
//            while ((i = br.read()) != -1) {
//                System.out.println((char) i);
//            }
//        } catch(IOException e){
//            throw new RuntimeException(e);
//        }

        //5 В цикле while меняем вызов метода у br на readLine() что-бы читать построково
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            String str;
//            while ((str = br.readLine()) != null) {
//                System.out.println(str);
//            }
//        } catch(IOException e){
//            throw new RuntimeException(e);
//        }

        //6 Пример записи данных в файл при помощи баффередРайтера
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
//            bw.newLine();
//            bw.write("We invoke method .newLine() to have each write session in separate line");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //7 Нужно разобраться с методами класса PrintWriter, найти метод который не перезатирает файл.
//        try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
//            //pw.write("Writing files with PrintWriter via write");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


    }
}
