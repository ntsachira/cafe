/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.model;

import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Prince
 */
public class ImageSaver {

    public static String saveImageFromUser(String destinationFileName, String destinationFilePath) {
        // Create a file chooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select an image");

        // Filter for image files only
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File file) {
                String filename = file.getName().toLowerCase();
                return file.isDirectory() || filename.endsWith(".png") || filename.endsWith(".jpg") || filename.endsWith(".jpeg");
            }

            public String getDescription() {
                return "Image Files (*.png, *.jpg, *.jpeg)";
            }
        });

        // Show the file chooser dialog
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                // Read the image from the selected file
                BufferedImage image = ImageIO.read(selectedFile);

                // Create the destination file path
                File destinationFile = new File(destinationFilePath, destinationFileName);

                // Write the image to the destination file
                ImageIO.write(image, "png", destinationFile);

                // Return the absolute path of the saved file
                return destinationFile.getAbsolutePath();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            // User cancelled the file chooser
            return null;
        }
    }
}
