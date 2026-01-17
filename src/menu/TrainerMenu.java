package menu;

import com.Matthew.Fitness_center.Trainer;

import static menu.Fitness_Center_Menu.Trainers;

public class TrainerMenu implements Busy{

    @Override
    public void work(int index){
        Trainer trainer = Trainers.get(index);
        System.out.println(trainer.getName() + " doing a warmup with the clients");
    }

    @Override
    public void exercise(int index){
        Trainer trainer = Trainers.get(index);
        System.out.println(trainer.getName() + " teaching students " + trainer.getSpecialization());
    }
}

