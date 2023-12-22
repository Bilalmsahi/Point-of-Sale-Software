package raven.application.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.util.UIScale;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import raven.application.Application;
import raven.application.form.other.DefaultForm;
import raven.menu.Menu;
import raven.menu.MenuAction;

/**
 *
 * @author Raven
 */
public class MainForm extends JLayeredPane {

    public MainForm() {
        init();
    }

    private void init() {
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setLayout(new MainFormLayout());
        menu = new Menu();
        panelBody = new JPanel(new BorderLayout());
        menuButton = new JButton(new FlatSVGIcon("raven/icon/svg/menu_left.svg", 0.8f));
        menuButton.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Menu.button.background;"
                + "arc:999;"
                + "focusWidth:0;"
                + "borderWidth:0");
        menuButton.addActionListener((ActionEvent e) -> {
            setMenuFull(!menu.isMenuFull());
        });
        initMenuEvent();
        setLayer(menuButton, JLayeredPane.POPUP_LAYER);
        add(menuButton);
        add(menu);
        add(panelBody);
    }

    private void initMenuEvent() {
       
        menu.addMenuEvent((int index, int subIndex, MenuAction action) -> {
             Application.showForm(new DefaultForm("Form : " ));
            if (index == 0) {
              
            } else if (index == 1) {
                Application.showForm(new Dashboard());
                
            } else if (index == 2) {
                    Application.showForm(new Sales());
            }else if (index == 3) {
                    Application.showForm(new Return());
            }else if (index == 4) {
                if (subIndex == 1) {
                    Application.showForm(new Customers());
                } else {
                    action.cancel();
                }
            }else if (index == 5) {
                Application.showForm(new Voucher());
                    
            }else if (index == 6) {
                if (subIndex == 1) {
                    Application.showForm(new StockAvailable());
                }else if (subIndex == 2) {
                    Application.showForm(new AddNewStock());
            }else if (subIndex == 3) {
                    Application.showForm(new AddACategory());
            }else if (subIndex == 4) {
                    Application.showForm(new UpdateProduct());
            }else if (subIndex == 5) {
                    Application.showForm(new LowStock());
            }else if (subIndex == 6) {
                    Application.showForm(new ExpiredStock());
            } else {
                    action.cancel();
                }
            }else if (index == 7) {
                Application.showForm(new AddNewStaff1());
            }else if (index == 8) {
                    if (subIndex == 1) {
                  Application.showForm(new AddStoreExpenses());
                }  else {
                    action.cancel();
                }
            }else if (index == 9) {
                    if (subIndex == 1) {
                  Application.showForm(new AddUpdateUser());
                }else if (subIndex == 2) {
                    Application.showForm(new AddRole());
            }else {
                    action.cancel();
                }
            }else if (index == 10) {
                    if (subIndex == 1) {
                  Application.showForm(new ShopAccounts());
                }  else {
                    action.cancel();
                }
            }else if (index == 11) {
                if (subIndex == 1) {
                    Application.showForm(new SuppliersRecord());
                }else if (subIndex == 2) {
                    Application.showForm(new PaymentRecord());
            }else {
                    action.cancel();
                }
            }else if (index == 12) {
                if (subIndex == 1) {
                    Application.showForm(new OrderToSupplier());
                }else if (subIndex == 2) {
                    Application.showForm(new PendingOrders());
            }else if (subIndex == 3) {
                    Application.showForm(new PaymentHistory());
            }else if (subIndex == 4) {
                    Application.showForm(new PaymentRecord());
            }else {
                    action.cancel();
                }
            }else if (index == 13) {
                    Application.showForm(new ReturnToSupplier());
            }else if (index == 14) {
                
                if (subIndex == 1) {
                    Application.showForm(new StockAvailable());
                }else if (subIndex == 2) {
                    Application.showForm(new LowStock());
            }else if (subIndex == 3) {
                    Application.showForm(new ReportTotalSales());
            }else if (subIndex == 4) {
                    Application.showForm(new ShopAccounts());
            }else if (subIndex == 5) {
                    Application.showForm(new ReportTotalStockAdded());
            }else if (subIndex == 6) {
                    Application.showForm(new ReportTotalProductsSold());
            }else if (subIndex == 7) {
                    Application.showForm(new ReportTotalExpenses());
            }else if (subIndex == 8) {
                    Application.showForm(new ReportProductsReturned());
            }else if (subIndex == 9) {
                    Application.showForm(new ReportSupplierReturned());
            }else if (subIndex == 10) {
                    Application.showForm(new PaymentRecord());
            }else {
                    action.cancel();
                }
            }else if (index == 15) {
                    Application.showForm(new BackUp());
            }else if (index == 16) {
                Application.logout();
            }else if (index == 17) {
                 Application.showForm(new About());
            }else if (index == 18) {
                 Application.showForm(new Properties());
            } else {
                action.cancel();
            }
        });
   
            

}

    private void setMenuFull(boolean full) {
        String icon = full ? "menu_left.svg" : "menu_right.svg";
        menuButton.setIcon(new FlatSVGIcon("raven/icon/svg/" + icon, 0.8f));
        menu.setMenuFull(full);
        revalidate();
    }

    public void hideMenu() {
        menu.hideMenuItem();
    }

    public void showForm(Component component) {
        panelBody.removeAll();
        panelBody.add(component);
        panelBody.repaint();
        panelBody.revalidate();
    }

    public void setSelectedMenu(int index, int subIndex) {
        menu.setSelectedMenu(index, subIndex);
    }

    private Menu menu;
    private JPanel panelBody;
    private JButton menuButton;

    private class MainFormLayout implements LayoutManager {

        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                return new Dimension(5, 5);
            }
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                return new Dimension(0, 0);
            }
        }

        @Override
        public void layoutContainer(Container parent) {
            synchronized (parent.getTreeLock()) {
                Insets insets = UIScale.scale(parent.getInsets());
                int x = insets.left;
                int y = insets.top;
                int width = parent.getWidth() - (insets.left + insets.right);
                int height = parent.getHeight() - (insets.top + insets.bottom);
                int menuWidth = UIScale.scale(menu.isMenuFull() ? menu.getMenuMaxWidth() : menu.getMenuMinWidth());
                menu.setBounds(x, y, menuWidth, height);
                int menuButtonWidth = menuButton.getPreferredSize().width;
                int menuButtonHeight = menuButton.getPreferredSize().height;
                int menuX = (int) (x + menuWidth - (menuButtonWidth * (menu.isMenuFull() ? 0.5f : 0.3f)));
                menuButton.setBounds(menuX, UIScale.scale(30), menuButtonWidth, menuButtonHeight);

                int gap = UIScale.scale(5);
                int bodyWidth = width - menuWidth - gap;
                int bodyHeight = height;
                int bodyx = x + menuWidth + gap;
                int bodyy = y;
                panelBody.setBounds(bodyx, bodyy, bodyWidth, bodyHeight);
            }
        }
    }
}
