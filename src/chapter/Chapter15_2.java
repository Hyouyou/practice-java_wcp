package chapter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Chapter15_2 {
	public static void main(String[] args) {
		/*FileSystem fs = FileSystems.getDefault();
	    // PathクラスのインスタンスをFileSystem.getPathメソッドで生成
	    Path inputPath = fs.getPath("resouces/input.txt");
	    Path outputPath = fs.getPath("resouces/output.txt");*/
		Path inputPath = Paths.get("resources/input.txt");
		Path outputPath = Paths.get("resources/output.txt");

	    // Java7以降に追加された「try-with-resources」文で処理
	    // Filesクラスを使用して、BufferedReaderクラスのインスタンスを生成
	    // Filesクラスを使用して、BufferedWriterクラスのインスタンスを生成
	    try (BufferedReader br = Files.newBufferedReader(inputPath);
	    		BufferedWriter bw = Files.newBufferedWriter(outputPath)) {

	        String line = null;
	        // BufferedReader.readLineメソッドを使用して、1行づつ処理
	        // 読み込む行がなくなるまでループ
	        while ((line = br.readLine()) != null) {
	            // 文字数が5以外の場合はスキップ
	            if(line.length() != 5) {
	            	continue;
	            }
	            // 読み込んだ1行を出力
	            bw.write(line);
	            // 改行がついてないので改行を出力
	            bw.newLine();
	        }

	    // 例外処理を記述
	    // printStackTraceで例外を出力
	    } catch (IOException e)  {
	        e.printStackTrace();
	    } finally {
	        System.out.println("出力処理終了");
	    }

		/*回答
	    FileSystem fs = FileSystems.getDefault();
        // PathクラスのインスタンスをFileSystem.getPathメソッドで生成
        Path inputPath = fs.getPath("resources/input.txt");
        Path outputPath = fs.getPath("resources/output.txt");

        // Java7以降に追加された「try-with-resources」文で処理
        // Filesクラスを使用して、BufferedReaderクラスのインスタンスを生成
        // Filesクラスを使用して、BufferedWriterクラスのインスタンスを生成
        try (BufferedReader reader = Files.newBufferedReader(inputPath);
                BufferedWriter writer = Files.newBufferedWriter(outputPath);) {

            String line = null;
            // BufferedReader.readLineメソッドを使用して、1行づつ処理
            // 読み込む行がなくなるまでループ
            while ((line = reader.readLine()) != null) {
                // 文字数が5以外の場合はスキップ
                if (line.length() != 5) {
                    continue;
                }
                // 読み込んだ1行を出力
                writer.write(line);
                // 改行がついてないので改行を出力
                writer.newLine();
            }

            // 例外処理を記述
            // printStackTraceで例外を出力
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("出力処理終了");
        }*/
	}
}
