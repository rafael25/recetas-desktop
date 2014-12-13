/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.rafael25.recetas.desktop;

import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author rafael
 */
public class RecetaCard extends javax.swing.JPanel {
	
	Receta receta;
	/**
	 * Creates new form RecetaCard
	 * @param receta
	 */
	public RecetaCard(Receta receta) {
		initComponents();
		this.receta = receta;
		this.nombreLabel.setText(receta.getNombre());
		this.tiempoLabel.setText("Tiempo: "+receta.getTiempoPrep()+" minutos");
	}
	
	public void descargarImagen() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Image img = ImageIO.read(new URL(receta.getImg().getUrl()));
					imagenLabel.setIcon(new ImageIcon(img));
				} catch (Exception e) {
				}
			}
		}).start();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagenLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        tiempoLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nombreLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        nombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreLabel.setText("Nombre");
        nombreLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        tiempoLabel.setText("Tiempo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tiempoLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(nombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tiempoLabel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel tiempoLabel;
    // End of variables declaration//GEN-END:variables
}