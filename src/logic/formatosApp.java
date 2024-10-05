
package logic;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class formatosApp {
    
    public static DocumentFilter formatoTelefono = new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                // Verifica si el texto a insertar es válido
                if (isValid(string, fb.getDocument().getLength(), offset)) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Verifica si el texto a reemplazar es válido
                if (isValid(text, fb.getDocument().getLength() - length, offset)) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }

            private boolean isValid(String text, int currentLength, int offset) {
                // Verifica si el texto es un número de exactamente dos dígitos
                return text.matches("\\d{0,2}") && (currentLength + text.length() - 1) <= 7;
            }
        };
    
    public static DocumentFilter formatoCantidad = new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                // Verifica si el texto a insertar es válido
                if (isValid(string, fb.getDocument().getLength(), offset)) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Verifica si el texto a reemplazar es válido
                if (isValid(text, fb.getDocument().getLength() - length, offset)) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }

            private boolean isValid(String text, int currentLength, int offset) {
                // Verifica si el texto es un número de exactamente dos dígitos
                return text.matches("\\d{0,2}") && (currentLength + text.length() - 1) <= 1;
            }
        };
    
    public static DocumentFilter formatoCodigoPrenda = new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, javax.swing.text.AttributeSet attr) throws BadLocationException {
                if (isValid(string)) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, javax.swing.text.AttributeSet attrs) throws BadLocationException {
                if (isValid(text)) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }

            private boolean isValid(String text) {
                // Solo permite letras y números
                return text.matches("[a-zA-Z0-9]*");
            }
        };
    
    public static DocumentFilter formatoID =  new DocumentFilter(){
         @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, javax.swing.text.AttributeSet attr) throws BadLocationException {
                if (isValid(string)) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, javax.swing.text.AttributeSet attrs) throws BadLocationException {
                if (isValid(text)) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }

            private boolean isValid(String text) {
                // Solo permite números
                return text.matches("[0-9]*");
            }
        };
    
}
