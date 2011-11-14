package prettify.theme;

import java.awt.Color;
import java.awt.Font;
import prettify.Theme;

/**
 * Sunbrust theme.
 * Vim sunburst theme by David Leibovic.
 * @author David Leibovic
 */
public class ThemeSunburst extends Theme {

    public ThemeSunburst() {
        super();

        /* Vim sunburst theme by David Leibovic */

        setFont(new Font("Consolas", Font.PLAIN, 12));
        setBackground(Color.black);

        setHighlightedBackground(Color.decode("0x444444"));

        setGutterText(Color.decode("0xffffff"));
        setGutterBorderColor(Color.decode("0x777777"));
        setGutterBorderWidth(3);
        setGutterTextFont(new Font("Verdana", Font.PLAIN, 11));
        setGutterTextPaddingLeft(7);
        setGutterTextPaddingRight(7);

        Style plainStyle = new Style();
        plainStyle.setColor(Color.decode("0xffffff"));
        setPlain(plainStyle);

        Style style;

        style = new Style();
        style.setColor(Color.decode("0x65B042")); /* string  - green */
        setString(style);

        style = new Style();
        style.setColor(Color.decode("0xE28964")); /* keyword - dark pink */
        setKeyword(style);

        style = new Style();
        style.setColor(Color.decode("0xAEAEAE")); /* comment - gray */
        style.setItalic(true);
        setComment(style);

        style = new Style();
        style.setColor(Color.decode("0x89bdff")); /* type - light blue */
        setType(style);

        style = new Style();
        style.setColor(Color.decode("0x3387CC")); /* literal - blue */
        setLiteral(style);

        style = new Style();
        style.setColor(Color.decode("0xffffff")); /* punctuation - white */
        setPunctuation(style);

        style = new Style();
        style.setColor(Color.decode("0x89bdff")); /* html/xml tag    - light blue */
        setTag(style);

        style = new Style();
        style.setColor(Color.decode("0x3387CC")); /* decimal - blue */
        setDeclaration(style);

        style = new Style();
        style.setColor(Color.decode("0xbdb76b")); /* html/xml attribute name  - khaki */
        setAttributeName(style);

        style = new Style();
        style.setColor(Color.decode("0x65B042")); /* html/xml attribute value - green */
        setAttributeValue(style);

        setNoCode(plainStyle);

        setOpenBracket(plainStyle);

        setCloseBracket(plainStyle);

        setVariable(plainStyle);

        setFunction(plainStyle);
    }
}