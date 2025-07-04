//this code is a simple implementation of a GUI application that allows users to select a career and view its details.
// It uses Java Swing to create a user interface with dropdowns, text fields, and labels.
// The application displays information about various engineering careers, including job title, field, company, education, salary, hours, certification/experience, responsibilities, and associated universities and colleges.
// The user can select a job from a dropdown menu, and the corresponding details will be displayed in the text fields.
// The application is designed to be user-friendly and informative, providing a quick overview of different career options in the engineering field.

package AdvancedJavaProjects;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CareersGUI {

    public static void main(String[] args) {
        // Create the main JFrame
        JFrame frame = new JFrame("Career Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Set layout to GridLayout with 10 rows, 2 columns, and spacing
        frame.setLayout(new GridLayout(10, 2, 10, 10));

        // Job options
        String[] jobs = {"Civil Engineering", "Mechanical Engineering", "Electrical Engineering", "Software Engineering", "Environmental Engineering"};

        // Dropdown for job selection
        JLabel jobLabel = new JLabel("Select Job:");
        JComboBox<String> jobDropdown = new JComboBox<>(jobs);

        // Text fields for job details
        JTextField titleField = new JTextField();
        JTextField fieldField = new JTextField();
        JTextField companyField = new JTextField();
        JTextField educationField = new JTextField();
        JTextField salaryField = new JTextField();
        JTextField hoursField = new JTextField();
        JTextField certField = new JTextField();
        JTextArea responsibilitiesField = new JTextArea(3, 20);
        JTextField universityField = new JTextField();
        JTextField collegeField = new JTextField();

        // Disable editing for text fields
        JTextField[] fields = {titleField, fieldField, companyField, educationField, salaryField, hoursField, certField, universityField, collegeField};
        for (JTextField field : fields) {
            field.setEditable(false);
        }
        responsibilitiesField.setEditable(false);
        responsibilitiesField.setLineWrap(true);
        responsibilitiesField.setWrapStyleWord(true);

        // Add components to the frame
        frame.add(jobLabel);
        frame.add(jobDropdown);

        frame.add(new JLabel("Job Title:"));
        frame.add(titleField);

        frame.add(new JLabel("Field:"));
        frame.add(fieldField);

        frame.add(new JLabel("Company:"));
        frame.add(companyField);

        frame.add(new JLabel("Education:"));
        frame.add(educationField);

        frame.add(new JLabel("Salary:"));
        frame.add(salaryField);

        frame.add(new JLabel("Hours:"));
        frame.add(hoursField);

        frame.add(new JLabel("Certification/Experience:"));
        frame.add(certField);

        frame.add(new JLabel("Responsibilities:"));
        JScrollPane scrollPane = new JScrollPane(responsibilitiesField);
        scrollPane.setPreferredSize(new Dimension(400, 60));
        frame.add(scrollPane);

        frame.add(new JLabel("University:"));
        frame.add(universityField);

        frame.add(new JLabel("College:"));
        frame.add(collegeField);

        // Data for each job
        String[][] jobData = {
            {"Civil Engineering", "Engineering",
             "Various construction firms, engineering consultancies, and government agencies",
             "Bachelor's degree in Civil Engineering", "$69,338 per year",
             "40 hours per week", "Professional Engineer (P.Eng.) designation; experience in project management and design software",
             "Planning, designing, developing, and managing projects for the construction or repair of infrastructure such as buildings, roads, bridges, and water systems",
             "University of Toronto, University of British Columbia", "Seneca College, George Brown College"
            },
            {"Mechanical Engineering", "Engineering",
             "Manufacturing companies, automotive firms, and aerospace industries",
             "Bachelor's degree in Mechanical Engineering", "$60,000–$70,000 per year",
             "40 hours per week", "Professional Engineer (P.Eng.) designation; proficiency in CAD software and experience in product design",
             "Researching, designing, and developing machinery and systems for heating, ventilation, air conditioning, power generation, and manufacturing",
             "McGill University, University of Alberta", "Humber College, Sheridan College"
            },
            {"Electrical Engineer", "Engineering",
             "Electrical utilities, telecommunications companies, and electronics manufacturers",
             "Bachelor's degree in Electrical Engineering", "$70,000 to $110,000",
             "40 hours per week", "Professional Engineer (P.Eng.) designation; experience with electrical systems design and analysis",
             "Designing, planning, researching, evaluating, and testing electrical and electronic equipment and systems",
             "University of Waterloo, University of Calgary", "Fanshawe College, Conestoga College"
            },
            {"Software Engineering", "Engineering",
             "Tech companies, financial institutions, and startups",
             "Bachelor's degree in Software Engineering or Computer Science", "$73,000 to CA$126,000",
             "35-40 hours per week", "Experience with programming languages, software development methodologies, and system design",
             "Developing, testing, and maintaining software applications and systems to meet clients' needs",
             "University of Toronto, University of British Columbia", "Seneca College, George Brown College"
            },
            {"Environmental Engineering", "Engineering",
             "Environmental consulting firms, government agencies, and non-profit organizations",
             "Bachelor's degree in Environmental Engineering", "$60,000 to $100,000",
             "35-40 hours per week", "Professional Engineer (P.Eng.) designation; knowledge of environmental regulations and sustainability practices",
             "Researching and developing solutions to environmental challenges, such as pollution control, waste management, and sustainable design",
             "University of Guelph, University of Saskatchewan", "Durham College, Mohawk College"
            }
        };

        // ActionListener to handle job selection
        jobDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = jobDropdown.getSelectedIndex();
                String[] selectedJob = jobData[selectedIndex];

                // Update text fields with selected job details
                titleField.setText(selectedJob[0]);
                fieldField.setText(selectedJob[1]);
                companyField.setText(selectedJob[2]);
                educationField.setText(selectedJob[3]);
                salaryField.setText(selectedJob[4]);
                hoursField.setText(selectedJob[5]);
                certField.setText(selectedJob[6]);
                responsibilitiesField.setText(selectedJob[7]);
                universityField.setText(selectedJob[8]);
                collegeField.setText(selectedJob[9]);
            }
        });

        // Set default selection
        jobDropdown.setSelectedIndex(0);

        // Make the frame visible
        frame.setVisible(true);
    }

}
