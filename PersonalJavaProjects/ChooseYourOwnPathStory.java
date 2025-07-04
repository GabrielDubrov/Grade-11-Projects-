//this is a choose your own path story game.
//the game is about a young wizard named Aelor who must confront a dragon named Fáfnir to save his homeland, Elarion.
//the game has multiple endings based on the choices made by the player.
//the game is designed to be played in a console environment.
//the game has 49 endings, 8 of which are good endings, 2 of which are neutral endings, and 36 of which are bad endings with 3 true endings.

package PersonalJavaProjects;
import java.util.Scanner;

public class ChooseYourOwnPathStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aelor's Dilemma: The Dragon’s Quest");
        System.out.println("\nCreated by Gabriel Dubrov");
        System.out.println("\nYou are Aelor, a young wizard in the enchanting land of Elarion. The air crackles with magic, and vibrant forests stretch as far as the eye can see. However, beneath the surface of this beautiful realm lies a darkening threat. Your mentor, the wise Grand Wizard Merle, has warned you of an ancient dragon, Fáfnir, who has awakened from centuries of slumber. His fiery breath threatens to engulf the land in flames, consuming everything in its path. As you absorb Merle's grave warnings, you feel the weight of responsibility pressing upon you. The safety of Elarion rests in your hands, and you know that your next steps are crucial. To save your homeland from impending doom, you must choose your path wisely, for the choices you make will shape the destiny of the realm. How will you approach the threat of Fáfnir?");

        // First Choice
        System.out.println("\n1. Seek Knowledge");
        System.out.println("2. Gather Allies");
        System.out.println("3. Confront the Dragon Directly\n");

        int choice1 = scanner.nextInt();
        switch (choice1) {
            case 1: // Seek Knowledge
                System.out.println("You journey to the Grand Library of Eldoria, where the scent of ancient parchment fills the air. As you sift through the dusty tomes, you uncover the secrets of Fáfnir’s history and the three potent artifacts that could weaken him. The Amulet of Flames harnesses the power of fire, allowing its wielder to unleash scorching bursts that can burn away the dragon’s scales. The Crystal of Shadows grants you the ability to use Darkness which a handful of people learned. Lastly, the Sword of Light glows with radiant energy that can pierce through the dragon's defences, inflicting damage that burns like sunlight on Fáfnir’s shadowy form. Which artifact will you pursue in your quest to defeat the mighty dragon?");
                System.out.println("\n1. The Amulet of Flames");
                System.out.println("2. The Crystal of Shadows");
                System.out.println("3. The Sword of Light\n");

                int choice1A = scanner.nextInt();
                switch (choice1A) {
                    case 1: // The Amulet of Flames
                        System.out.println("You decide go with the Amulet of Flames but its in the Drax volcano. As the searing heat of the Drax volcano engulfs you, the ground trembles beneath your feet. Molten rivers bubble and hiss, their glowing light casting ominous shadows across the jagged rocks. You know the Amulet of Flames is close, but so are the Fire Golems, the guardians of this fiery realm. Their towering forms of molten stone rise from the lava pools, eyes glowing like embers. You feel the heat intensify as they tread toward you, each step a rumbling quake. Fire crackles around them, sending sparks into the air. What do you do?");
                        System.out.println("\n1. Brave the Fire Golems");
                        System.out.println("2. Use Ice Magic to Shield Yourself");
                        System.out.println("3. Find a Secret Tunnel\n");

                        int choice1A1 = scanner.nextInt();
                        switch (choice1A1) {
                            case 1: // Brave the Fire Golems
                                System.out.println("\nSummoning all your courage, you charge forward, hoping to outmaneuver them, but they move faster than expected. One of the golems hurls a boulder of molten stone at you, and before you can react, the impact throws you into the air. You crash hard against the ground, the heat scorching your skin. As you try to stand, flames burn at your clothes, and the intense heat overwhelms you. In moments, everything fades into darkness.  The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                            case 2: // Use Ice Magic
                                System.out.println("\nYou summon ice magic with all your courage, drawing on your magical strength. Perhaps you could outsmart them or outlast them; however, your mind responds late. A colossal fist of flame strikes, and the heat is unbearable. Your defenses falter, and in a flash of agony, your body succumbs to the fire. Darkness overtakes you, and the quest ends here; your character remains lost to the inferno. The End ");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                            case 3: // Find a Secret Tunnel
                                System.out.println("You search the rocky terrain, scanning cracks and crevices in the molten ground. Then, you spot a narrow opening hidden by stones and shadows. Curious, you clear the debris to reveal a cool, untouched tunnel. You slip inside, the air growing cooler as you descend. After what feels like hours, you reach a vast chamber. On a blackened stone pedestal sits the glowing Amulet of Flames. You’ve found the way forward; with the amulet in hand, you turn your focus to Fafnir’s lair. The path ahead is dangerous, but the amulet’s power leads you forward. You carefully navigate the treacherous terrain, your heart pounding with anticipation. At last, you reach the mouth of Fafnir’s cave, a dark abyss pulsating with the dragon's fierce energy. How do you proceed with the quest?");
                                System.out.println("\n1. Use the Amulet’s Power Directly");
                                System.out.println("2. Set a Trap Using the Amulet");
                                System.out.println("3. Seek the Help of Fire Spirits\n");

                                int choice1A1_3 = scanner.nextInt();
                                switch (choice1A1_3) {
                                    case 1: // Use the Amulet’s Power Directly
                                        System.out.println("\nWith the Amulet of Flames secured, you take a deep breath and step into the cave. The air is thick with heat, and the shadows dance ominously around you. As you approach Fafnir, you feel the amulet's energy coursing through your veins, giving you a sense of purpose. Deciding to confront the dragon directly, you focus on the amulet’s power. A surge of fiery energy envelops you, and you unleash its magic toward Fafnir. The dragon roars in fury, and the resulting clash of power sends shockwaves through the cavern. The battle is fierce, and in the end, it culminates in a climactic showdown, resulting in mutual destruction as both you and Fafnir are consumed by the flames. In that moment, you realize that the quest for power can lead to unforeseen consequences, and the price of bravery may be higher than you anticipated. The End");
                                        System.out.println("\nFortunately and Unfortunately, out of the 49 endings, you got one of the 2 neutral ending.");
                                        break;
                                    case 2: // Set a Trap
                                        System.out.println("\nWith the Amulet in hand, you stand before the dark mouth of Fafnir’s cave, contemplating your next move. Feeling the amulet's power surge through you, you decide to set a trap. You gather rocks, vines, and burnt wood to craft a snare, infusing it with fiery magic from the amulet. Suddenly, the ground shakes as Fafnir stirs deep within the cave. Just as you finish, you hear the dragon's growl echoing toward you. You hide, hoping your trap will work. But as Fafnir charges, the trap fails to hold. The dragon breaks free, and your plan collapses. The ground trembles as you feel the heat of his breath, and you realize your fate is sealed. You’ve underestimated the beast, and the confrontation ends in your demise. The End");
                                        System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                        break;
                                    case 3: // Seek Help of Fire Spirits
                                        System.out.println("\nYou call upon the ethereal beings, summoning their aid with the amulet’s power. The spirits respond, swirling around you in a brilliant blaze of light. Together, you charge into the cave, where the spirits join forces with you to confront Fafnir. As fire engulfs the cavern, the air crackles with energy. The spirits weave intricate patterns of flames, drawing Fafnir's attention while you prepare your final strike. The dragon roars in fury, its scales glimmering in the fiery glow, but the spirits amplify your magic, transforming it into a torrent of fire. With one last united effort, you unleash your combined strength, hitting Fafnir with unstoppable force. The explosion resonates through the mountain, and for a moment, you stand victorious amid the flickering embers, aware that you have triumphed over a legendary foe. The End");
                                        System.out.println("\nFortunately, out of the 49 endings, you got one of the 8 good endings.");
                                        break;
                                }
                                break;
                        }
                        break;
                    case 2: // The Crystal of Shadows
                        System.out.println("You decide to go with the Crystal of Shadows, but its in the Shadow Woods. As you move deeper into the Shadow Woods, a chilling sensation washes over you. The Shadow Beasts emerge from the darkness, their forms shifting like smoke. They are skinny and shifty, gliding silently through the gloom. Each beast has glowing, ember-like eyes that pierce the darkness, watching you intently. Their long, sharp claws glint with an unnatural light, and their mouths twist into sinister grins, revealing jagged teeth that seem to absorb the shadows around them. The air thickens with dread as they draw warmth from the environment. Their low growls echo like distant thunder, warning you that they are not to be underestimated. In the twisted roots and shadows, you realize these creatures are not just beasts; they are the very embodiment of darkness, ready to defend their territory fiercely.  How do you deal with the Shadow Beasts?");
                        System.out.println("\n1. Fight with Magic");
                        System.out.println("2. Use a Stealth Approach");
                        System.out.println("3. Negotiate with the Shadows\n");

                        int choice1A2 = scanner.nextInt();
                        switch (choice1A2) {
                            case 1: // Fight with Magic
                                System.out.println("\nYou summon your spells, launching bursts of energy at the beasts. The air crackles with raw power as your magic collides with the shadowy forms, momentarily pushing them back. But their relentless numbers soon close in, and the darkness becomes a chaotic whirlwind around you. Each attempt to fend them off drains your strength, and despite your valiant efforts, you find yourself overwhelmed. The shadows engulf you, and as you fall, you feel the weight of despair settle in, the darkness closing in around you, leaving only silence behind. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                            case 2: // Use a Stealth Approach
                                System.out.println("\nYou carefully move through the shadows, hoping to slip past the beasts unnoticed. Every step is measured, every breath held as you blend into the darkness. Just as you reach the crystal, a guardian springs from the shadows, its eyes glowing ominously. You barely have time to react as it lunges at you with blinding speed, launching a surprise attack that catches you off guard. The creature's strength is immense, and before you can gather your thoughts or defend yourself, you find yourself overpowered, resulting in your demise as the guardian's fury overwhelms you. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                            case 3: // Negotiate with the Shadows
                                System.out.println("You call upon their ancient wisdom, and to your surprise, they listen. With each word, you weave a tale of understanding, acknowledging the shadows' place in the world and offering respect for their power. Your voice resonates in the darkness, bridging the gap between light and shadow, and they begin to gather around you, intrigued by your sincerity. As the air thickens with a palpable energy, the shadows shift, forming an audience that weighs your words carefully. In a moment of shared purpose, they grant you their favor, allowing you to claim the Crystal of Shadows and embrace its dark power. You start head toward Fafnir’s cave. At last, you reach the mouth of Fafnir’s cave,You call upon their ancient wisdom, and to your surprise, they listen. With each word, you weave a tale of understanding, acknowledging the shadows' place in the world and offering respect for their power. Your voice resonates in the darkness, bridging the gap between light and shadow, and they begin to gather around you, intrigued by your sincerity. As the air thickens with a palpable energy, the shadows shift, forming an audience that weighs your words carefully. In a moment of shared purpose, they grant you their favor, allowing you to claim the Crystal of Shadows and embrace its dark power. You start head toward Fafnir’s cave. At last, you reach the mouth of Fafnir’s cave, a dark abyss pulsating with the dragon's fierce energy. How do you proceed with the quest?You call upon their ancient wisdom, and to your surprise, they listen. With each word, you weave a tale of understanding, acknowledging the shadows' place in the world and offering respect for their power. Your voice resonates in the darkness, bridging the gap between light and shadow, and they begin to gather around you, intrigued by your sincerity. As the air thickens with a palpable energy, the shadows shift, forming an audience that weighs your words carefully. In a moment of shared purpose, they grant you their favor, allowing you to claim the Crystal of Shadows and embrace its dark power. You start head toward Fafnir’s cave. At last, you reach the mouth of Fafnir’s cave, a dark abyss pulsating with the dragon's fierce energy. How do you proceed with the quest? a dark abyss pulsating with the dragon's fierce energy. How do you proceed with the quest?");
                                System.out.println("\n1. Absorb its Power to Strengthen Yourself");
                                System.out.println("2. Use it to Summon Shadow Beasts Against Fáfnir");
                                System.out.println("3. Offer it to Fáfnir as a Bargain\n");

                                int choice1A2_3 = scanner.nextInt();
                                switch (choice1A2_3) {
                                    case 1: // Absorb Power
                                        System.out.println("\nYou decide to absorb its power to strengthen yourself. As you absorb the crystal's energy, old memories flood back, and a chilling realization takes hold. You remember your past life as a dark mage, consumed by a thirst for vengeance against Elarion for the brutal slaughter of your family. In your quest for revenge, you had sealed your immense powers and ancient knowledge within this crystal, believing it would serve as a vessel for your rebirth. Now, as the energy surges through you, you feel your former self awakening, igniting a renewed desire to ally with Fafnir and unleashing your fury upon Elarion, whose actions set you on this dark path. The End");
                                        System.out.println("\nCongratulations, out of the 49 endings, you got one of the 3 true endings.");
                                        break;
                                    case 2: // Summon Shadow Beasts
                                        System.out.println("\nYou decide to harness the crystal’s power to summon shadow beasts for your final showdown. The dark energy flows through you, calling forth formidable creatures from the depths of the Shadow Woods. With their assistance, you prepare to confront Fafnir, fueled by a newfound confidence. As the shadow beasts swarm around you, you launch into battle against the dragon, their spectral forms creating a mesmerizing distraction. In a fierce clash of power and fury, you and your summoned allies overwhelm Fafnir, ultimately slaying the dragon in a breathtaking display of dark magic and teamwork. But something isn’t right as you slowly regain blurred memories of your past, however, you brush it off like it's nothing important. The End ");
                                        System.out.println("\nFortunately, out of the 49 endings, you got one of the 8 good endings.");
                                        break;
                                    case 3: // Offer to Fáfnir
                                        System.out.println("\nYou attempt to bargain with Fafnir, offering the crystal in exchange for power and protection. Your voice trembles with urgency as you explain the potential of the crystal and the strength it could bestow upon him. However, the dragon's cold eyes narrow, and he sees you as a cunning threat rather than an ally. In the midst of your desperate plea, Fafnir strikes with lightning speed, his massive jaws closing around you before you can finish your proposal, extinguishing your hopes and life in an instant. The End");
                                        System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                        break;
                                }
                                break;
                        }
                        break;
                    case 3: // The Sword of Light
                        System.out.println("You decide to go with the sword of light, but it's in the Celestial Towers. As you enter the towers the Celestial Guardian towers before you, a being made of pure, radiant light. Its glowing, humanoid form is wrapped in shimmering armour, with wings of light extending from its back. Its eyes burn like twin suns, and it holds a massive spear crackling with celestial energy. Every movement feels deliberate as if the heavens themselves sent this powerful being to protect the Sword of Light. Behind the guardian, the Sword of Light rests on a polished stone pedestal. The blade shines with a silvery glow, its runes softly pulsing with ancient magic. A single gem on the hilt glimmers with gold and white light. The sword hums with power, drawing you toward it, and you know it holds the strength to defeat Fafnir. How do you proceed?");
                        System.out.println("\n1. Challenge the Celestial Guardian");
                        System.out.println("2. Solve the Riddles of the Tower");
                        System.out.println("3. Steal the Sword Using Magic\n");

                        int choice1A3 = scanner.nextInt();
                        switch (choice1A3) {
                            case 1: // Challenge the Celestial Guardian
                                System.out.println("\nYou step forward, challenging the towering Celestial Guardian with all the courage you can muster. The being of light raises its spear, its eyes burning like twin suns as it prepares for battle. You summon your magic, hurling spell after spell, but each is effortlessly deflected by the guardian’s shimmering armour. In one swift motion, the guardian strikes with its spear, the impact of celestial energy overwhelming your defences. The last thing you see is the radiant light engulfing you, and in that instant, your journey comes to a tragic end. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                            case 2: // Solve the Riddles
                                System.out.println("As you stand before the Celestial Guardian, you realize brute force won’t prevail here. Instead, you focus on the tower’s ancient magic, seeking to unlock its secrets. A voice echoes from the walls, presenting you with riddles that test your knowledge and wisdom. With each riddle solved, the guardian steps aside, its blazing eyes watching intently. Finally, with the last riddle answered, the guardian lowers its spear. You approach the Sword of Light, its silver glow illuminating the chamber, and lift it from the pedestal. The blade hums in your hand, you are now ready to face Fafnir. Few hours later. At last, you reach the mouth of Fafnir’s cave, a dark abyss pulsating with the dragon's fierce energy. How do you proceed with the quest?");
                                System.out.println("\n1. Challenge Fáfnir to a Duel");
                                System.out.println("2. Seek to Seal Fáfnir’s Power with the Sword");
                                System.out.println("3. Combine the Sword’s Power with Other Magic\n");

                                int choice1A3_2 = scanner.nextInt();
                                switch (choice1A3_2) {
                                    case 1: // Challenge Fáfnir to a Duel
                                        System.out.println("\nWith the Sword of Light in hand, you step into the cave and call out to Fafnir, challenging the beast to a final duel. The dragon emerges, its massive form filling the cavern. The clash is brutal and fierce, a battle of wills and strength. Though the sword’s power is unmatched, Fafnir's might is overwhelming. In the end, your victory comes at a great cost as the two of you fall together, locked in mutual destruction, a hero’s sacrifice for the greater good. The End");
                                        System.out.println("\nFortunately and Unfortunately, out of the 49 endings, you got one of the 2 neutral ending.");
                                        break;
                                    case 2: // Seal Fáfnir’s Power
                                        System.out.println("\nYou raise the Sword of Light, not to strike, but to bind. Channelling its ancient magic, you seek to seal Fafnir's power within the blade itself. The dragon roars in defiance, but the sword’s light grows brighter, trapping the beast within its glowing runes. With a final surge of magic, Fafnir’s essence is sealed, and the sword lodges itself into a nearby stone, immovable. A new legend is born, the Sword in the Stone, awaiting a future hero to claim it. The End");
                                        System.out.println("\nFortunately, out of the 49 endings, you got one of the 8 good endings.");
                                        break;
                                    case 3: // Combine Power
                                        System.out.println("\nIn a bold move, you attempt to merge the power of the Sword of Light with your own magic, seeking to amplify its strength. As the energies intertwine, you feel an overwhelming surge of power. But something goes wrong, the magic turns on you, and in a moment of horrifying realization, your soul becomes bound to the sword itself. The last thing you see is the sword falling to the ground, gleaming with your trapped essence, a silent testament to your failed ambition. The End ");
                                        System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                        break;
                                }
                                break;
                            case 3: // Steal the Sword
                                System.out.println("\nHoping to avoid a direct confrontation, you quietly weave an invisibility spell around yourself, blending into the shadows. Slowly, you inch toward the Sword of Light, its glow pulsing with power. Just as your hand hovers over the hilt, the Celestial Guardian turns its blazing eyes upon you. Despite your magical cloak, it senses your presence. In an instant, the guardian’s spear strikes with blinding speed, and your spell shatters. The last thing you feel is the searing impact of celestial energy as the guardian delivers its final blow, ending your quest. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                        }
                        break;
                }
                break;
            case 2: // Gather Allies
                System.out.println("You decide to gather allies, embarking on a journey to the Forest of Elves to seek aid from the Elven Queen and her army. Upon your arrival, the Elves listen intently to your plight. After much deliberation, they agree to help—but only if you complete a favor for them. “We need your assistance,” the Elven Queen states, her voice melodic yet firm. “Retrieve a sacred relic from the Dark Swamp, slay a beast that terrorizes our woods, or free our captured kin from a Goblin camp. Choose wisely.” What do you choose?");
                System.out.println("\n1. Retrieve a Sacred Relic from the Dark Swamp");
                System.out.println("2. Slay a Beast That Terrorizes the Elven Woods");
                System.out.println("3. Free Captured Elves from a Goblin Camp\n");

                int choice1B = scanner.nextInt();
                switch (choice1B) {
                    case 1: // Retrieve a Sacred Relic
                        System.out.println("You choose to retrieve the sacred relic, your journey leads you into the treacherous Dark Swamp. The air is thick with fog, and the ground constraints beneath your feet. As you navigate the murky waters, a sense of foreboding washes over you. Suddenly, a sinister presence looms ahead, the Swamp Witch, guardian of the relic, blocks your path with a wicked grin. You know you must act quickly. Do you…");
                        System.out.println("\n1. Fight Through the Swamp Monsters");
                        System.out.println("2. Outsmart the Swamp Witch Guarding the Relic");
                        System.out.println("3. Seek Help from a Local Hermit\n");

                        int choice1B1 = scanner.nextInt();
                        switch (choice1B1) {
                            case 1: // Fight Through Swamp Monsters
                                System.out.println("\nYou decide to fight through the swamp monsters, summoning your magic and charging forward. But the twisted creatures of the swamp are relentless, overwhelming you with sheer numbers. Despite your best efforts, you find yourself defeated, your body lost to the depths of the swamp. The last thing you see is a sea of clenching teeth and glowing eyes, closing in around you. As darkness envelops you, the chilling laughter of the Swamp Witch echoes in your ears, sealing your fate forever. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                            case 2: // Outsmart the Witch
                                System.out.println("You choose to outsmart the Swamp Witch. You study her sly smile and devise a cunning plan, conjuring up an illusion with your magic. You manage to get the relic back with its power pulsating in your hands after tricking the Witch with your devious plan. As you grasp the relic, you feel its energy surge through you, filling you with newfound strength. With the Witch none the wiser, you slip back into the shadows, your heart racing with triumph as you make your escape. Do you...");
                                System.out.println("\n1. Offer it Directly to the Elven Queen");
                                System.out.println("2. Use the Relic to Strengthen the Elven Army");
                                System.out.println("3. Take the Relic for Yourself and Leave\n");

                                int choice1B1_2 = scanner.nextInt();
                                switch (choice1B1_2) {
                                    case 1: // Offer it to the Queen
                                        System.out.println("\nYou offer it directly to the Elven Queen, approaching her with hope, ready to present the powerful relic. However, her guards, corrupted by greed, betray you before you can even reach her, leaving you vulnerable and outnumbered. As you fight back, you realize that the queen’s trust has been misplaced, and you must now defend yourself against those you sought to help. In a desperate struggle, you find yourself overwhelmed, and the darkness of betrayal closes in around you. The End");
                                        System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                        break;
                                    case 2: // Use it to Strengthen the Army
                                        System.out.println("\nYou use the relic to strengthen the Elven Army, channelling its magic to enhance its strength. The air crackles with energy as they rally behind you, and with fierce determination, you lead them into a final battle against Fáfnir. The dragon roars as you clash in a fierce showdown. With a powerful strike, you combine your magic with the relic’s energy, delivering the final blow. Fáfnir crashes to the ground, defeated, and the land is freed from his tyranny. The grateful queen declares you a champion of the realm. However, the relic’s power has unforeseen consequences. The magic transforms your allies into dark elves, their features twisting and darkening. Awakened by malevolent forces, they unleash hellish spells that devastate the land, boiling rivers and withering forests. In mere days, Elarion is consumed by darkness. The dark elves turn on one another, annihilating everything in their path. The air fills with screams as your allies become harbingers of destruction, and the once-vibrant kingdom is left in ruins. With a heavy heart, you watch as the beauty of Elarion fades into a desolate wasteland. The victory over Fáfnir has birthed a far greater tragedy, leaving you alone in the ashes of your home, surrounded by shadows that claim all. The End");
                                        System.out.println("\nCongratulations, out of the 49 endings, you got one of the 3 true endings.");
                                        break;
                                    case 3: // Take the Relic
                                        System.out.println("\nYou decide to take the relic for yourself and leave, thinking of the power it could bring. But as you attempt to escape, you are caught, your ambitions leading to your imprisonment and a grim fate of the death penalty awaiting you. In the dark confines of your cell, you reflect on your choices, realizing that the allure of power can lead to ruin. As your execution approaches, you vow that your next journey will be one of redemption, determined to learn from your mistakes. The End");
                                        System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                        break;
                                }
                                break;
                            case 3: // Seek Help from a Hermit
                                System.out.println("\nYou seek help from a local hermit, following the whispers of the swamp, hoping for guidance. You find the hermit, who offers to lead you to the relic. But as you trust him, you soon realize he is a mere pawn of the Witch, and you fall into her trap, unable to escape. Just as you sense the danger, he reveals his true form, cackling as he binds you with dark magic. The swamp’s eerie silence surrounds you as you realize the Witch’s grip on your fate has tightened, leaving you at her mercy. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                        }
                        break;
                    case 2: // Slay a Beast
                        System.out.println("You choose to slay the beast that has been terrorizing the Elven woods, knowing that this act will secure the Queen's trust and help unite her army against the looming threat of Fáfnir. Tales of the creature's terror echo through the forest, a massive, ancient being that resembles a terrifying mix of bear and serpent, with glistening scales and poisonous fangs capable of bringing even the strongest warriors to their knees. Its unbreakable hide has thwarted many brave attempts to defeat it, leaving behind only the whispers of those who failed. The forest has grown silent with fear, and the elves look to you as their last hope. The stakes are high, and the weight of your decision weighs heavily on your shoulders, but you are determined to confront the monster and restore peace to Elarion. You approach the monsters’ lair; how do you proceed?");
                        System.out.println("\n1. Attack with Magic");
                        System.out.println("2. Use Traps and Tactics");
                        System.out.println("3. Lure the Beast Away\n");

                        int choice1B2 = scanner.nextInt();
                        switch (choice1B2) {
                            case 1: // Attack with Magic
                                System.out.println("\nWith a surge of confidence, you enter the beast’s lair, ready to prove your worth with powerful spells. As the creature emerges from the shadows, you unleash a torrent of fireballs and lightning bolts, the air crackling with energy. For a moment, it seems like your magic is working, but the beast’s thick hide absorbs the blows. Panic sets in as it charges toward you, faster than you anticipated. Before you can cast another spell, the creature lunges, sinking its fangs into your shoulder. Pain shoots through your body as its venom spreads, and darkness envelops you. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                            case 2: // Use Traps
                                System.out.println("Recognizing the beast's strength, you wisely decide to rely on strategy. You spend days studying its patterns, carefully laying traps throughout the forest and enhancing them with your magic. When the beast finally approaches, it falls into a hidden pit you’ve prepared. Roaring in fury, it struggles against the magical chains you conjured to hold it down. Seizing the moment, you draw a magical blade gifted by the Elven Queen and plunge it into the creature's heart. The beast thrashes for a moment before collapsing, its threat finally neutralized. What do you do with the body?");
                                System.out.println("\n1. Bring its Head to the Elven Queen");
                                System.out.println("2. Leave the Beast’s Body for Study");
                                System.out.println("3. Take a Trophy and Move On\n");

                                int choice1B2_2 = scanner.nextInt();
                                switch (choice1B2_2) {
                                    case 1: // Bring Head to Queen
                                        System.out.println("\nYou bring and hold the beast’s severed head before the Elven Queen, a symbol of your triumph and determination. The court erupts in cheers, celebrating your bravery and solidifying a powerful alliance between you and the elves. With newfound respect, you rally the elven army, their spirits ignited by the promise of vengeance against Fáfnir. As the sun rises, casting golden light upon the assembled forces, you strategize with the queen and her generals, crafting a plan to confront the dragon that has ravaged their lands. With archers poised and warriors armed, you lead the united front towards the dragon’s lair, every step resonating with purpose. The elves, once fragmented, now stand shoulder to shoulder with you, their resolve unbreakable. Together, you march towards Fáfnir, ready to reclaim what was lost and vanquish the beast once and for all. The End");
                                        System.out.println("\nFortunately, out of the 49 endings, you got one of the 8 good endings.");
                                        break;
                                    case 2: // Leave Body for Study
                                        System.out.println("\nYou decide to leave the beast’s body in the forest, believing it might be valuable for study. However, when you return to the Elven Queen, she is displeased. The lack of a trophy makes her doubt your success, and suspicion grows among her court. Before long, the Queen’s trust in you fades entirely, and you are betrayed by her advisors. Ambushed in the night, you are killed by the Elven warriors. The End");
                                        System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                        break;
                                    case 3: // Take Trophy
                                        System.out.println("\nRather than bringing the entire head, you take a small trophy, a fang from the beast, and continue your journey without informing the Elves. Unfortunately, when you later seek their aid, the Queen is insulted by your lack of communication and perceives it as cowardice. Without the support of the Elven army, Fáfnir remains undefeated. In the end, Elarion is engulfed in flames, and you meet your doom at the dragon's fiery breath. Achievement: Cool Trophy but at What Cost… The End");
                                        System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                        break;
                                }
                                break;
                            case 3: // Lure the Beast Away
                                System.out.println("\nInstead of confronting the beast directly, you decide to use your illusion magic to lead it away from the Elven woods. Carefully, you create a false trail with scents and sounds that entice the creature deeper into the forest. At first, your plan seems to work perfectly, and you breathe a sigh of relief. However, days later, as you prepare to return, you sense something is wrong. The ground trembles, and the beast, with its powerful sense of smell, has tracked you back down. It appears suddenly, eyes burning with fury, and before you can react, it lunges at you, sealing your fate. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                        }
                        break;
                    case 3: // Free Captured Elves
                        System.out.println("You decide to free the captured elves from the goblin camp. After talking to a nearby villager who gives you directions, you set out under the cover of night. The moonlight filters through the trees as you stealthily navigate the forest, every rustle making your heart race with anticipation. Finally, you reach the edge of the goblin camp and hide behind a thick cluster of trees. Through the branches, you catch sight of the goblins, their green skin glistening in the firelight. They are loud and rowdy, laughing and boasting about their recent captures. Your eyes quickly scan the area and land on the imprisoned elves. They huddle together, looking frightened and worn. You take a deep breath, knowing time is short. The goblins might notice you at any moment. You need to come up with a plan to free the elves. As you formulate your next move, you remind yourself that every moment counts. With determination building within you, you prepare to spring into action and rescue the elves from their captors. What action do you do to free the elves?");
                        System.out.println("\n1. Sneak into the Camp");
                        System.out.println("2. Cause a Distraction");
                        System.out.println("3. Negotiate with the Goblin Leader\n");

                        int choice1B3 = scanner.nextInt();
                        switch (choice1B3) {
                            case 1: // Sneak into the Camp
                                System.out.println("You opt for stealth, drawing upon the training you received from the Grand Wizard Merle. Cloaking yourself in shadows, you slip silently through the dense underbrush, approaching the goblin camp. The flickering firelight reveals several goblins lounging around, their voices filled with raucous laughter, unaware of your presence. As you navigate the perimeter, you spot the makeshift cages where the captured elves are held. Timing your movements perfectly, you wait for a moment when a few guards drift away, distracted by a game of dice. With your heart racing, you cast a spell of invisibility upon yourself, becoming a wraith in the night. You glide past the guards and reach the cages. Whispering a spell of unlocking, the enchanted bars creak open, and the elves emerge, eyes wide with hope and gratitude. “Thank you, brave wizard,” one elf whispers. “But we must move quickly before they realize we’re gone.” You and the elves leave the camp far enough to make a decision. What decision will you follow?");
                                System.out.println("\n1. Lead them Back to the Queen");
                                System.out.println("2. Attack the Goblins with the Elves’ Help");
                                System.out.println("3. Settle the Elves Elsewhere\n");

                                int choice1B3_1 = scanner.nextInt();
                                switch (choice1B3_1) {
                                    case 1: // Lead Back to Queen
                                        System.out.println("\nYou guide the freed elves back to the Elven Queen’s grand palace. Upon your return, she embraces you warmly, praising your courage and resourcefulness in rescuing her kin. With trust established, the alliance is solidified, and together you devise a meticulous strategy for the impending confrontation with Fáfnir. As the dragon's shadow looms over Elarion, you and the united Elven army prepare for battle. You unleash powerful arcane spells while the elves rain arrows from above, creating a deadly symphony of magic and precision. In a fierce clash, your combined forces drive Fáfnir away, securing peace for the realm and elevating your reputation to that of a legendary hero. The End");
                                        System.out.println("\nFortunately, out of the 49 endings, you got one of the 8 good endings.");
                                        break;
                                    case 2: // Attack Goblins
                                        System.out.println("\nInstead of returning to the queen, you inspire the elves to join you in a bold assault on the goblin camp. With their bows drawn and your magic crackling in the air, the elves unleash a storm of arrows, creating chaos among the goblins. However, as the battle rages on, the goblin leader calls for reinforcements, tipping the scales of war. Amidst the turmoil, you find yourself ensnared in the crossfire, struggling to differentiate between friend and foe. Despite your valiant efforts to rally the elves, the goblins retaliate with ferocity, overwhelming you in a tide of chaos. You are captured, and the elves are taken once more, leaving your fate uncertain and Elarion’s hopes shattered. The End");
                                        System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                        break;
                                    case 3: // Settle Elsewhere
                                        System.out.println("\nYou propose relocating the elves to a safer haven, believing they need time to regroup and gain strength before facing Fáfnir. However, as you journey toward a secluded glade, a grim reality unfolds: the area is overrun with ravenous werewolves. Despite your spells illuminating the darkness, the creatures attack with relentless fury. You fight valiantly, but their overwhelming numbers create an inescapable chaos. One by one, the elves are killed, and you find yourself outmatched in the feral onslaught. As darkness engulfs the land, your noble quest to save Elarion ends tragically, leaving only echoes of despair and the haunting memory of those you sought to protect. The End");
                                        System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                        break;
                                }
                                break;
                            case 2: // Cause a Distraction
                                System.out.println("\nYou decide to create a distraction to draw the goblins away. You conjure a loud explosion in the distance. As the goblins rush to investigate, you attempt to free the elves, but your plan backfires. A goblin sees you and raises the alarm. Caught off guard, you are captured alongside the elves. The goblin leader decides to hold a grand feast to celebrate your capture. As you sit in the dimly lit tent, you realize the importance of strategy in battle. Unfortunately, you remain trapped, and your quest to save Elarion fails. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                            case 3: // Negotiate with Goblin Leader
                                System.out.println("\nYou approach the goblin leader, trying to negotiate for the release of the captured elves in exchange for gold and treasures. However, the goblins, wild and unruly, misunderstand your language, causing confusion and chaos in the dimly lit cave. As you struggle to make yourself understood, the goblin leader suddenly realizes you are not one of them. With a growl of anger, he orders your capture, and you are seized and thrown into a dank cell alongside the very elves you sought to save. Your attempt at diplomacy has failed miserably, leaving you powerless to prevent the impending doom wrought by Fáfnir. The dragon, enraged and unstoppable, descends upon Elarion, reducing the once-thriving land to smouldering ruins. Despair fills the air as the echoes of destruction resonate through the remains of a shattered realm. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                        }
                        break;
                }
                break;
            case 3: // Confront the Dragon Directly
                System.out.println("You decide to head straight to Fáfnir’s lair, a towering mountain where the sky is choked with smoke and ash. The land around it is charred and cracked, with rivers of lava winding through the scorched earth. As you approach the entrance to the lair, the ground rumbles beneath your feet, and the air shimmers with heat. Fáfnir's presence is overwhelming, a force of raw elemental power that could incinerate the world. What do you do?");
                System.out.println("\n1. Challenge Fáfnir Immediately");
                System.out.println("2. Search for Weaknesses in the Lair");
                System.out.println("3. Attempt to Negotiate with the Dragon\n");

                int choice1C = scanner.nextInt();
                switch (choice1C) {
                    case 1: // Challenge Fáfnir Immediately
                        System.out.println("You stand before the entrance of the dark cavern, your staff gripped tightly in your hand, summoning every ounce of courage within you. The air is thick with the scent of sulfur, and the sound of Fáfnir's roars reverberates through the stone walls, shaking the very ground beneath your feet. With each echo, a sense of dread washes over you, but you steel your resolve. Taking a deep breath, you step inside, the shadows closing around you. The cavern is vast and foreboding, illuminated only by the flickering glow of molten rock. From the depths, Fáfnir's colossal form begins to rise, scales gleaming like molten metal, reflecting the dim light in fiery hues. As he emerges, the ground trembles with each thunderous step, and a rush of heat washes over you, bringing with it the unmistakable scent of dragonfire. You gaze up at the magnificent beast, a mix of fear and determination swelling in your chest.  With the dragon's fierce eyes locked onto you, you prepare to confront the ancient terror that threatens the very land of Elarion. how do you proceed to defeat Fafnir?");
                        System.out.println("\n1. Attack with Full Magic Power");
                        System.out.println("2. Defend and Observe the Dragon’s Patterns");
                        System.out.println("3. Use Illusions to Confuse Fáfnir\n");

                        int choice1C1 = scanner.nextInt();
                        switch (choice1C1) {
                            case 1: // Attack with Full Magic Power
                                System.out.println("\nWith a surge of adrenaline, you unleash every ounce of magical energy you possess. Flames, lightning, and raw arcane power stream from your hands, crashing into Fáfnir. But the dragon is ancient, its scales hardened against magic. Fáfnir laughs as your energy wanes, and with a single fiery breath, you are overwhelmed. Your body crumples as darkness takes you, defeated by the sheer power of the dragon. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                            case 2: // Defend and Observe
                                System.out.println("Instead of rushing to attack, you decide to defend and study Fáfnir's movements. The dragon lashes out with fiery breath and sweeping claws, but you remain calm, staying just out of reach, deflecting the attacks with carefully timed shield spells. As the battle rages on, you notice something: the dragon’s attacks follow a rhythm. Each movement, though overwhelming in power, has a subtle predictability. As you focus, something inside you shifts. Your eyes begin to burn, and an ancient power stirs within you. Suddenly, your vision changes, sharpening into clarity. The world around you slows down, and you realize you can see into the future, just a few seconds ahead. Every movement Fáfnir makes, every flicker of his tail or flare of his nostrils, now appears to you before it happens. This newfound power, the Mangekyo, allows you to perceive not just the flow of magic but the very fabric of time itself. With each second of foresight, you begin to understand Fáfnir's weaknesses. You can see when his flames will surge and where his claws will strike. His attacks are still powerful, but now you are always one step ahead, predicting his next move before it happens. What weakness will you take advantage of?");
                                System.out.println("\n1. Target the Dragon’s Eyes");
                                System.out.println("2. Use Magic to Break Its Scales");
                                System.out.println("3. Summon a Magical Shield to Counterattack\n");

                                int choice1C1_2 = scanner.nextInt();
                                switch (choice1C1_2) {
                                    case 1: // Target the Eyes
                                        System.out.println("\nYou know that without sight, Fáfnir’s coordination will falter. You gather your magic, aiming for his blazing, molten eyes, the windows to his immense power. You release a focused beam of energy just as his fiery breath swells in his chest. The blast connects with precision, striking Fáfnir directly in his eyes. He shrieks a sound that shakes the very mountain, as his vision is consumed by blinding darkness. But in his agony, Fáfnir thrashes wildly. His massive claws swing chaotically, and his body writhes in pure rage. Though you can see his attacks coming, his erratic movements are too fast and overwhelming to fully evade. You attempt to dodge, but it is too late; one of his sweeping claws catches you, sending you crashing into the hard stone walls of the lair. Dazed, you realize you’ve miscalculated. Though the dragon is blind, his raw power is still immense, and now you are too wounded to continue the fight. As you attempt to leave, you bleed out as everything turns dark. The End");
                                        System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                        break;
                                    case 2: // Break Its Scales
                                        System.out.println("\nFáfnir’s true strength lies in his impenetrable scales, but now, with the power of foresight, you can see the small cracks forming between the plates of armour. Realizing that his scales are not flawless, you summon all your magical energy and weave a spell that targets these weak points. As the dragon lunges forward, you cast a focused torrent of energy, striking the precise gaps between his scales. With each second, his movements slow, and finally, a deafening crack rings as one of the largest scales shatters, exposing his vulnerable flesh beneath. As you prepare for the final strike, the energy of the Mangekyo swirls within you, revealing a secret ability, a powerful black flame known as Amaterasu. This ancient magic manifests as an inextinguishable flame that seeks out its target, relentlessly consuming everything in its path. Taking a deep breath, you channel your remaining energy into a conjuration, raising your hands to form a swirling sphere of black flame, feeling its destructive potential pulsing in your palms. With your eyes locked onto Fáfnir, you unleash Amaterasu toward the dragon. The black flames streak through the air, engulfing him like a serpent. Fáfnir roars in rage and agony as the flames cling to him, burning hotter than any fire he has known. There is no escape from this magical fire; it consumes his very essence, and it will not be extinguished until it has taken everything from him including his life. When you get out of the cave and get back to Elarion, the Grand Wizard Merle sees that you obtained the ancient eyes and makes you the next Grand Wizard. The End");
                                        System.out.println("\nCongratulations, out of the 49 endings, you got one of the 3 true endings.");
                                        break;
                                    case 3: // Summon Shield
                                        System.out.println("\nAs Fáfnir's attacks become increasingly wild and desperate, you consider drawing upon your enhanced perception to summon a powerful magical shield, one that can not only protect you but also counterattack. You weave the spell, layers of arcane energy swirling into a protective barrier around you. The shield hums with power, ready to unleash a powerful strike against the dragon. But something in Fáfnir’s demeanour changes. He slows his movements and focuses directly on you. His blazing eyes narrow, and suddenly, you sense that he’s realized your secret. The dragon knows you have the ancient power of the Mangekyo, and worse, he understands how to use it against you. With a roar, Fáfnir lets out a burst of fire aimed not at your shield but at the space just beyond it. Your foresight falters; he's no longer attacking you directly but manipulating his flames to overwhelm your shield with waves of unpredictable heat. As the shield collapses under the assault, you are left vulnerable. In one swift move, Fáfnir closes in and strikes, and you fall to the ground, killed by your overconfidence. The End");
                                        System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                        break;
                                }
                                break;
                            case 3: // Use Illusions
                                System.out.println("\nYou draw on your deep well of magical knowledge, feeling a surge of power as you prepare to weave an illusion, conjuring ghostly figures that flit about the cavern like an army of warriors. “Fáfnir!” you call, your voice echoing against the walls. “You face not just a wizard, but a legion!” The dragon narrows his fiery gaze, nostrils flaring as he senses the magic, and the illusory soldiers move in unison, brandishing spectral weapons and filling the air with battle cries. At first, it seems effective; Fáfnir hesitates, confusion in his eyes as he prepares to unleash fire upon the phantoms. Seizing the moment, you attempt to cast a binding spell, but too late you realize that Fáfnir is no ordinary dragon, he is ancient, wise, and far more powerful than you anticipated. With a roar that shakes the cavern, he dispels your illusions with a sweep of his tail, causing them to vanish like smoke. The ground quakes, and heat envelops you as Fáfnir turns his furious gaze upon you, panic gripping your heart. You try to cast a defensive spell, but it’s too late; the dragon lunges, jaws snapping open to reveal rows of glinting teeth. Your heart races as the intense heat radiates from his maw, desperation fueling your final words, a plea for mercy or a last-ditch protection spell, but Fáfnir is unmoved. In an instant that feels eternal, the world fades away, consumed by flames as the dragon's fire engulfs you, bringing instant and overwhelming pain. Darkness closes in, and you realize your journey ends here, swallowed by the very terror you sought to conquer. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                        }
                        break;
                    case 2: // Search for Weaknesses
                        System.out.println("You decided to search for weaknesses in Fáfnir's cave, knowing that understanding the dragon’s vulnerabilities could be your key to victory. As you stepped deeper into the lair, the air grew thick with heat and the stench of sulphur. Shadows danced along the walls, flickering in the light of molten rock that illuminated the cavern's interior. The ground trembled slightly beneath your feet, a constant reminder of the dragon's immense power lying just ahead. You cautiously moved through the cavern, your senses heightened, scanning every crevice and corner for anything that might give you an edge. After several tense moments, you noticed 3 things in the area. Which one do you approach?");
                        System.out.println("\n1. A Hidden Trap in the Lair");
                        System.out.println("2. A Magical Artifact Left by a Previous Wizard");
                        System.out.println("3. A Secret Exit Used by the Dragon\n");

                        int choice1C2 = scanner.nextInt();
                        switch (choice1C2) {
                            case 1: // Hidden Trap
                                System.out.println("\nAs you delve deeper into the cavern, your eyes catch a glimmer of light. You approach to find a shiny artifact embedded in the rocky wall, adorned with intricate runes and shimmering gems. However, as you reach out to grasp it, a loud clang reverberates through the lair. You suddenly realize that the artifact is part of a trap set by Fáfnir’s former servant. A hidden mechanism triggers, causing the ground to rumble violently. Before you can react, the cavern begins to collapse around you, burying you in a shower of stone and debris. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                            case 2: // Magical Artifact
                                System.out.println("As you delve deeper into the cavern, your eyes catch a glimmer of light there is an artifact. The artifact you uncovered is a crystalline pendant, suspended from a delicate silver chain. It shimmers with a radiant glow that seems to pulse in time with your heartbeat. The crystal is faceted, catching the dim light of the cavern and refracting it into a spectrum of colours that dance across the stone walls. Intricate runes are etched along its surface, glowing faintly with ancient magic. As you hold the pendant, you feel a warmth spreading through your fingertips, a sensation that resonates with the very essence of magic. The artifact is said to harness elemental energy, enabling the wielder to amplify their spells. It grants you the ability to penetrate the dragon's defences, turning your magical attacks into devastating blasts of power. With each pulse of energy you feel, you realize that this pendant is not only a weapon but also a beacon of hope, a chance to overcome the ancient terror that is Fáfnir. How do you use the Artifact?");
                                System.out.println("\n1. Channel Its Power Against the Dragon");
                                System.out.println("2. Use It to Summon a Spirit for Guidance");
                                System.out.println("3. Break the Artifact to Release Its Magic\n");

                                int choice1C2_2 = scanner.nextInt();
                                switch (choice1C2_2) {
                                    case 1: // Channel Its Power
                                        System.out.println("\nYou decide to harness the artifact’s energy, weaving a spell that resonates with its power. As you focus, the air crackles with magic and a radiant light surround you. You unleash the spell just as Fáfnir enters the chamber, directing the energy toward the gaps in his scales. The power strikes true, causing several scales to shatter like glass. The dragon lets out a deafening roar of pain and fury, but you remain resolute. With each surge of energy from the artifact, you weaken him further. In a climactic showdown, you deliver a final blow that sends Fáfnir reeling, banishing him from the realm of Elarion. The End");
                                        System.out.println("\nFortunately, out of the 49 endings, you got one of the 8 good endings.");
                                        break;
                                    case 2: // Summon Spirit
                                        System.out.println("\nYou decide to use the artifact’s energy to summon a powerful spirit for assistance. Focusing your thoughts, you channel the magical energy into an incantation, calling forth the spirit of a legendary warrior known for defeating dragons. However, the energy of the artifact takes a dark turn, summoning a vengeful spirit instead. It manifests before you, its eyes glowing with malice. Realizing it is hostile, you attempt to defend yourself, but the spirit’s rage is overwhelming. You are caught off guard as it unleashes its fury upon you, and you succumb to its wrath. The End");
                                        System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                        break;
                                    case 3: // Break Artifact
                                        System.out.println("\nIn a moment of desperation, you opt to break the artifact, believing that releasing its magic will grant you an edge in the battle. As you shatter it, chaotic energy bursts forth, filling the chamber with a blinding light. However, the raw magic spirals out of control, and you struggle to contain it. The energy overwhelms you, and before you know it, you are consumed by the unleashed power, meeting a tragic end. The End");
                                        System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                        break;
                                }
                                break;
                            case 3: // Secret Exit
                                System.out.println("\nWhile exploring, you stumble upon a narrow passage hidden behind a curtain of shadows. It seems to lead deeper into the lair, away from the main chamber. Curiosity gets the better of you, and you decide to investigate. As you navigate the winding tunnels, you find a secret exit used by the dragon for escape. Just as you think you’ve found a way to outsmart Fáfnir, the exit opens up to a steep cliff, obscured by thick fog. Realizing too late that there’s no way to go back, you stumble and fall off the edge, the ground vanishing beneath you as the fog envelops you entirely. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                        }
                        break;
                    case 3: // Attempt to Negotiate
                        System.out.println("You decide to negotiate with Fáfnir with these three ideas in mind. As you stand at the mouth of the lair, the heat from within washes over you, and the smell of sulfur fills the air. Summoning your courage, you prepare to face the dragon, knowing that a direct confrontation could lead to your demise. With a deep breath, you step forward, your heart racing as you enter the cavern. Fáfnir’s colossal form emerges from the shadows, his scales gleaming ominously in the dim light. The ground trembles beneath you, and the air is charged with tension as you contemplate your next move. You can feel the raw power emanating from him, a force that could incinerate you in an instant. What idea do you follow?");
                        System.out.println("\n1. Offer Your Services to the Dragon");
                        System.out.println("2. Bargain for the Safety of Elarion");
                        System.out.println("3. Feign Loyalty to the Dragon\n");

                        int choice1C3 = scanner.nextInt();
                        switch (choice1C3) {
                            case 1: // Offer Services
                                System.out.println("\nYou bow before Fáfnir, offering your magical talents in exchange for sparing your life. The dragon’s eyes gleam with amusement as he considers your offer. His booming voice fills the cavern, promising power and protection in return for your eternal servitude. However, you quickly realize the weight of your choice. Fáfnir binds you with an unbreakable oath, chaining you to his will. Your once-noble quest to protect Elarion is now twisted, and you are forever enslaved to the dragon’s malevolent whims. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                            case 2: // Bargain for Safety
                                System.out.println("Standing firm in the face of Fáfnir’s overwhelming presence, you plead for the safety of your homeland, Elarion. You speak of the kingdom’s people, its beauty, and its future, hoping to appeal to some sense of reason within the dragon. Fáfnir listens, his eyes narrowing as he considers your words. His interest is piqued, he doesn’t strike you down immediately. Instead, he offers a chance, he will spare Elarion if you can offer something of value in return. The negotiation continues, though you feel the weight of the decision pressing down on you. You must now tread carefully, for one wrong move could mean the end of everything you hold dear. What do you offer to Fafnir?");
                                System.out.println("\n1. Offer Your Soul to Bind a Truce");
                                System.out.println("2. Reveal Secrets of Dragon-Slaying Magic");
                                System.out.println("3. Propose a Pact for Mutual Protection\n");

                                int choice1C3_2 = scanner.nextInt();
                                switch (choice1C3_2) {
                                    case 1: // Offer Soul
                                        System.out.println("\nIn a last-ditch effort, you offer your very soul to bind a truce with Fáfnir. The dragon considers this offer carefully, his eyes gleaming with dark amusement. He accepts, and you feel the cold grip of his magic taking hold of your essence. Bound to him by an unbreakable curse, your soul becomes a part of his power. While Elarion may be spared, for now, your fate is sealed. You become a servant to Fáfnir’s will for all eternity, your freedom forever lost. The End");
                                        System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                        break;
                                    case 2: // Reveal Secrets
                                        System.out.println("You reveal ancient secrets of dragon-slaying magic passed down by your mentors, knowing it is a dangerous gamble. Fáfnir listens intently, intrigued by your knowledge. He does not strike you down, but instead, he shares an ancient secret of his own, a truth about dragons that no human has ever known. You sense a shift in the negotiation as the balance of power begins to change. Fáfnir is no longer merely a threat but a potential source of hidden knowledge. The path forward is uncertain, but you feel the conversation shifting in your favour. How do you proceed with the conversation?");
                                        System.out.println("\n1. Attempt to Learn Fáfnir’s Weakness");
                                        System.out.println("2. Challenge Fáfnir to a Battle of Wits");
                                        System.out.println("3. Offer the Magic in Exchange for Peace\n");

                                        int choice1C3_2_2 = scanner.nextInt();
                                        switch (choice1C3_2_2) {
                                            case 1: // Learn Fáfnir’s Weakness
                                                System.out.println("\nIn an attempt to solidify your position, you press Fáfnir for more information about his weaknesses. But dragons are not so easily fooled. Fáfnir, realizing your intent, snarls with rage. You barely have time to react before the dragon turns on you, his wrath swift and merciless. The cavern fills with flames, and you fall before the might of the ancient beast, your ambition sealing your fate. The End");
                                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                                break;
                                            case 2: // Challenge to Battle of Wits
                                                System.out.println("\nWith newfound confidence, you challenge Fáfnir to a battle of wits, believing that your intelligence could outmatch his cunning. The dragon accepts, amused by your audacity. The mental duel is fierce and exhausting, as Fáfnir’s mind is ancient and vast. Slowly, you feel your thoughts unravel, overwhelmed by the sheer scope of his intellect. In the end, your mind falters, leaving you a broken shell, incapable of thought or action. The End");
                                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                                break;
                                            case 3: // Offer Magic for Peace
                                                System.out.println("\nYou offer the dragon-slaying magic as a gift in exchange for peace, a risky but calculated move. Fáfnir eyes you with a mix of curiosity and contempt, but ultimately, he agrees. In exchange for your knowledge, the dragon grants you peace, sparing Elarion and allowing you to return. The cost of the knowledge weighs heavy on your heart, but your people are safe, and the kingdom remains standing, for now. The End");
                                                System.out.println("\nFortunately, out of the 49 endings, you got one of the 8 good endings.");
                                                break;
                                        }
                                        break;
                                    case 3: // propose a pact
                                        System.out.println("Recognizing Fáfnir’s immense power, you suggest a pact for mutual protection. You argue that an alliance between you and the dragon could be beneficial for both parties. Fáfnir’s eyes narrow as he weighs the offer, and after a tense moment, he agrees. It is an uneasy alliance, but one that could secure the future of Elarion, at least for now. With this pact, you walk a fine line between cooperation and betrayal, knowing that the dragon’s loyalty is fickle at best. With this uneasy alliance, what do you offer to make it a normal alliance?");
                                        System.out.println("\n1. Offer Your Kingdom’s Resources");
                                        System.out.println("2. Swear an Oath to Aid Fáfnir Against Rivals");
                                        System.out.println("3. Reveal Your True Intentions\n");

                                        int choice1C3_2_3 = scanner.nextInt();
                                        switch (choice1C3_2_3) {
                                            case 1: // Offer Your Kingdom’s Resources
                                                System.out.println("\nIn a bid to sweeten the deal, you offer the vast resources of your kingdom, its wealth, its soldiers, and its magic. But Fáfnir has no need for mortal riches or armies. With a dark laugh, he rejects your offer, seeing through your desperation. Enraged by your presumption, the dragon unleashes his wrath upon Elarion. The kingdom burns in dragonfire, and you are left to witness the destruction you sought to prevent. The End ");
                                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                                break;
                                            case 2: // Swear an Oath to Aid Fáfnir
                                                System.out.println("\nYou offer Fáfnir a compelling deal: your aid in defeating his greatest rival, Abyssion, the Warden of the Ocean Depths. For centuries, Abyssion has ruled the seas, his control over the waters serving as a counterbalance to Fáfnir’s dominance on land. The two have been locked in a bitter rivalry, each seeking to expand their realms, but Abyssion's mastery over the tides has prevented Fáfnir from laying claim to the coastal territories he desires. In exchange for Elarion’s safety, you vow to use your magic to help Fáfnir destroy Abyssion once and for all. The serpent’s power is not only formidable but also cunning; he has thwarted Fáfnir’s advances with storms and tidal waves, ensuring that no land-bound creature can challenge him without consequence. Fáfnir’s eyes gleam with interest as he considers your proposal, his pride and ambition ignited. He accepts your oath, but the truce is fragile and built on the cliff of danger. Elarion’s survival now depends on your loyalty and the success of this treacherous alliance against Abyssion. The End");
                                                System.out.println("\nFortunately, out of the 49 endings, you got one of the 8 good endings.");
                                                break;
                                            case 3: // Reveal Your True Intentions
                                                System.out.println("\nIn a moment of reckless bravery, you reveal your true intentions, admitting that you only seek to protect your people and have no love for the dragon. Fáfnir, enraged by your audacity, strikes without hesitation. His fury is swift and merciless, and you find yourself at the mercy of the ancient beast. Your defiance was admirable, but it has cost you your life. The End");
                                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                                break;
                                        }
                                        break;
                                }
                                break;
                            case 3: // Feign Loyalty
                                System.out.println("\nYou pretend to swear devotion to Fáfnir, vowing to serve him in exchange for sparing your life and kingdom. The dragon's eyes burn with suspicion, but he allows you to speak. However, dragons are not easily deceived, and Fáfnir, sensing your treachery, lets out a roar of fury. Before you can react, his massive claw sweeps down, crushing you with ease. Your attempt to fool the ancient beast was futile, and your life ends in a moment of searing pain. The End");
                                System.out.println("\nUnfortunately, out of the 49 endings, you got one of the 36 bad endings.");
                                break;
                        }
                        break;
                }
                break;
        }
        scanner.close();
    }
}
