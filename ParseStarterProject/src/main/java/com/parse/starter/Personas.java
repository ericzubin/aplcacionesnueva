package com.parse.starter;

/**
 * Created by ERIC on 06/10/2015.
 */
public class Personas {
        private String nombre;
        private int drawableImageID;

        public Personas(int drawableImageID, String nombre ) {
            this.nombre = nombre;
            this.drawableImageID = drawableImageID;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getDrawableImageID(int ic_launcher) {
            return drawableImageID;
        }

        public void setDrawableImageID(int drawableImageID) {
            this.drawableImageID = drawableImageID;
        }

    }

