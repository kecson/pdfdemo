package com.yeokhengmeng.docstopdfconverter;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainClassTest {

    @Test
    public void main() {
        String[] args1 = new String[]{"-input", "E:\\Android\\Avcon\\移动端视频会议设计\\视频会议功能.docx",
                "-output", "C:\\Users\\56870\\Desktop\\视频会议功能.pdf",
                "-verbose"};

        MainClass.main(args1);

    }
}