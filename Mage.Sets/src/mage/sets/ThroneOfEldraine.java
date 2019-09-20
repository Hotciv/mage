package mage.sets;

import mage.cards.AdventureCard;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class ThroneOfEldraine extends ExpansionSet {

    private static final ThroneOfEldraine instance = new ThroneOfEldraine();

    public static ThroneOfEldraine getInstance() {
        return instance;
    }

    private ThroneOfEldraine() {
        super("Throne of Eldraine", "ELD", ExpansionSet.buildDate(2019, 10, 4), SetType.EXPANSION);
        this.blockName = "Throne of Eldraine";
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.maxCardNumberInBooster = 269;

        cards.add(new SetCardInfo("Acclaimed Contender", 1, Rarity.RARE, mage.cards.a.AcclaimedContender.class));
        cards.add(new SetCardInfo("Alela, Artful Provocateur", 324, Rarity.MYTHIC, mage.cards.a.AlelaArtfulProvocateur.class));
        cards.add(new SetCardInfo("All That Glitters", 2, Rarity.UNCOMMON, mage.cards.a.AllThatGlitters.class));
        cards.add(new SetCardInfo("Animating Faerie", 38, Rarity.UNCOMMON, mage.cards.a.AnimatingFaerie.class));
        cards.add(new SetCardInfo("Arcane Signet", 331, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Arcanist's Owl", 206, Rarity.UNCOMMON, mage.cards.a.ArcanistsOwl.class));
        cards.add(new SetCardInfo("Archon of Absolution", 3, Rarity.UNCOMMON, mage.cards.a.ArchonOfAbsolution.class));
        cards.add(new SetCardInfo("Ardenvale Paladin", 4, Rarity.COMMON, mage.cards.a.ArdenvalePaladin.class));
        cards.add(new SetCardInfo("Ardenvale Tactician", 5, Rarity.COMMON, mage.cards.a.ArdenvaleTactician.class));
        cards.add(new SetCardInfo("Ayara, First of Locthwain", 75, Rarity.RARE, mage.cards.a.AyaraFirstOfLocthwain.class));
        cards.add(new SetCardInfo("Bake into a Pie", 76, Rarity.COMMON, mage.cards.b.BakeIntoAPie.class));
        cards.add(new SetCardInfo("Banish into Fable", 325, Rarity.RARE, mage.cards.b.BanishIntoFable.class));
        cards.add(new SetCardInfo("Barge In", 112, Rarity.COMMON, mage.cards.b.BargeIn.class));
        cards.add(new SetCardInfo("Beanstalk Giant", 149, Rarity.UNCOMMON, mage.cards.b.BeanstalkGiant.class));
        cards.add(new SetCardInfo("Belle of the Brawl", 78, Rarity.UNCOMMON, mage.cards.b.BelleOfTheBrawl.class));
        cards.add(new SetCardInfo("Beloved Princess", 7, Rarity.COMMON, mage.cards.b.BelovedPrincess.class));
        cards.add(new SetCardInfo("Blacklance Paragon", 79, Rarity.RARE, mage.cards.b.BlacklanceParagon.class));
        cards.add(new SetCardInfo("Bloodhaze Wolverine", 113, Rarity.COMMON, mage.cards.b.BloodhazeWolverine.class));
        cards.add(new SetCardInfo("Blow Your House Down", 114, Rarity.COMMON, mage.cards.b.BlowYourHouseDown.class));
        cards.add(new SetCardInfo("Bog Naughty", 80, Rarity.UNCOMMON, mage.cards.b.BogNaughty.class));
        cards.add(new SetCardInfo("Bonecrusher Giant", 115, Rarity.RARE, mage.cards.b.BonecrusherGiant.class));
        cards.add(new SetCardInfo("Bramblefort Fink", 311, Rarity.UNCOMMON, mage.cards.b.BramblefortFink.class));
        cards.add(new SetCardInfo("Brazen Borrower", 39, Rarity.MYTHIC, mage.cards.b.BrazenBorrower.class));
        cards.add(new SetCardInfo("Brimstone Trebuchet", 116, Rarity.COMMON, mage.cards.b.BrimstoneTrebuchet.class));
        cards.add(new SetCardInfo("Burning-Yard Trainer", 117, Rarity.UNCOMMON, mage.cards.b.BurningYardTrainer.class));
        cards.add(new SetCardInfo("Castle Ardenvale", 238, Rarity.RARE, mage.cards.c.CastleArdenvale.class));
        cards.add(new SetCardInfo("Castle Embereth", 239, Rarity.RARE, mage.cards.c.CastleEmbereth.class));
        cards.add(new SetCardInfo("Castle Garenbrig", 240, Rarity.RARE, mage.cards.c.CastleGarenbrig.class));
        cards.add(new SetCardInfo("Castle Locthwain", 241, Rarity.RARE, mage.cards.c.CastleLocthwain.class));
        cards.add(new SetCardInfo("Castle Vantress", 242, Rarity.RARE, mage.cards.c.CastleVantress.class));
        cards.add(new SetCardInfo("Cauldron Familiar", 81, Rarity.UNCOMMON, mage.cards.c.CauldronFamiliar.class));
        cards.add(new SetCardInfo("Cauldron's Gift", 83, Rarity.UNCOMMON, mage.cards.c.CauldronsGift.class));
        cards.add(new SetCardInfo("Charmed Sleep", 40, Rarity.COMMON, mage.cards.c.CharmedSleep.class));
        cards.add(new SetCardInfo("Charming Prince", 8, Rarity.RARE, mage.cards.c.CharmingPrince.class));
        cards.add(new SetCardInfo("Chittering Witch", 319, Rarity.RARE, mage.cards.c.ChitteringWitch.class));
        cards.add(new SetCardInfo("Chulane, Teller of Tales", 326, Rarity.MYTHIC, mage.cards.c.ChulaneTellerOfTales.class));
        cards.add(new SetCardInfo("Clackbridge Troll", 84, Rarity.RARE, mage.cards.c.ClackbridgeTroll.class));
        cards.add(new SetCardInfo("Claim the Firstborn", 118, Rarity.UNCOMMON, mage.cards.c.ClaimTheFirstborn.class));
        cards.add(new SetCardInfo("Clockwork Servant", 216, Rarity.UNCOMMON, mage.cards.c.ClockworkServant.class));
        cards.add(new SetCardInfo("Command Tower", 333, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Corridor Monitor", 41, Rarity.COMMON, mage.cards.c.CorridorMonitor.class));
        cards.add(new SetCardInfo("Crashing Drawbridge", 217, Rarity.COMMON, mage.cards.c.CrashingDrawbridge.class));
        cards.add(new SetCardInfo("Crystal Slipper", 119, Rarity.COMMON, mage.cards.c.CrystalSlipper.class));
        cards.add(new SetCardInfo("Curious Pair", 150, Rarity.COMMON, mage.cards.c.CuriousPair.class));
        cards.add(new SetCardInfo("Dance of the Manse", 186, Rarity.RARE, mage.cards.d.DanceOfTheManse.class));
        cards.add(new SetCardInfo("Deafening Silence", 10, Rarity.UNCOMMON, mage.cards.d.DeafeningSilence.class));
        cards.add(new SetCardInfo("Doom Foretold", 187, Rarity.RARE, mage.cards.d.DoomForetold.class));
        cards.add(new SetCardInfo("Drown in the Loch", 188, Rarity.UNCOMMON, mage.cards.d.DrownInTheLoch.class));
        cards.add(new SetCardInfo("Edgewall Innkeeper", 151, Rarity.UNCOMMON, mage.cards.e.EdgewallInnkeeper.class));
        cards.add(new SetCardInfo("Elite Headhunter", 209, Rarity.UNCOMMON, mage.cards.e.EliteHeadhunter.class));
        cards.add(new SetCardInfo("Embercleave", 120, Rarity.MYTHIC, mage.cards.e.Embercleave.class));
        cards.add(new SetCardInfo("Embereth Paladin", 121, Rarity.COMMON, mage.cards.e.EmberethPaladin.class));
        cards.add(new SetCardInfo("Embereth Shieldbreaker", 122, Rarity.UNCOMMON, mage.cards.e.EmberethShieldbreaker.class));
        cards.add(new SetCardInfo("Embereth Skyblazer", 321, Rarity.RARE, mage.cards.e.EmberethSkyblazer.class));
        cards.add(new SetCardInfo("Emry, Lurker of the Loch", 43, Rarity.RARE, mage.cards.e.EmryLurkerOfTheLoch.class));
        cards.add(new SetCardInfo("Enchanted Carriage", 218, Rarity.UNCOMMON, mage.cards.e.EnchantedCarriage.class));
        cards.add(new SetCardInfo("Epic Downfall", 85, Rarity.UNCOMMON, mage.cards.e.EpicDownfall.class));
        cards.add(new SetCardInfo("Escape to the Wilds", 189, Rarity.RARE, mage.cards.e.EscapeToTheWilds.class));
        cards.add(new SetCardInfo("Eye Collector", 86, Rarity.COMMON, mage.cards.e.EyeCollector.class));
        cards.add(new SetCardInfo("Fabled Passage", 244, Rarity.RARE, mage.cards.f.FabledPassage.class));
        cards.add(new SetCardInfo("Fae of Wishes", 44, Rarity.RARE, mage.cards.f.FaeOfWishes.class));
        cards.add(new SetCardInfo("Faeburrow Elder", 190, Rarity.RARE, mage.cards.f.FaeburrowElder.class));
        cards.add(new SetCardInfo("Faerie Formation", 316, Rarity.RARE, mage.cards.f.FaerieFormation.class));
        cards.add(new SetCardInfo("Faerie Guidemother", 11, Rarity.COMMON, mage.cards.f.FaerieGuidemother.class));
        cards.add(new SetCardInfo("Faerie Vandal", 45, Rarity.UNCOMMON, mage.cards.f.FaerieVandal.class));
        cards.add(new SetCardInfo("Feasting Troll King", 152, Rarity.RARE, mage.cards.f.FeastingTrollKing.class));
        cards.add(new SetCardInfo("Fell the Pheasant", 153, Rarity.COMMON, mage.cards.f.FellThePheasant.class));
        cards.add(new SetCardInfo("Ferocity of the Wilds", 123, Rarity.UNCOMMON, mage.cards.f.FerocityOfTheWilds.class));
        cards.add(new SetCardInfo("Fervent Champion", 124, Rarity.RARE, mage.cards.f.FerventChampion.class));
        cards.add(new SetCardInfo("Festive Funeral", 87, Rarity.COMMON, mage.cards.f.FestiveFuneral.class));
        cards.add(new SetCardInfo("Fierce Witchstalker", 154, Rarity.COMMON, mage.cards.f.FierceWitchstalker.class));
        cards.add(new SetCardInfo("Fireborn Knight", 210, Rarity.UNCOMMON, mage.cards.f.FirebornKnight.class));
        cards.add(new SetCardInfo("Fires of Invention", 125, Rarity.RARE, mage.cards.f.FiresOfInvention.class));
        cards.add(new SetCardInfo("Flaxen Intruder", 155, Rarity.UNCOMMON, mage.cards.f.FlaxenIntruder.class));
        cards.add(new SetCardInfo("Fling", 126, Rarity.COMMON, mage.cards.f.Fling.class));
        cards.add(new SetCardInfo("Folio of Fancies", 46, Rarity.RARE, mage.cards.f.FolioOfFancies.class));
        cards.add(new SetCardInfo("Foreboding Fruit", 88, Rarity.COMMON, mage.cards.f.ForebodingFruit.class));
        cards.add(new SetCardInfo("Forest", 266, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 267, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 268, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 269, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forever Young", 89, Rarity.COMMON, mage.cards.f.ForeverYoung.class));
        cards.add(new SetCardInfo("Fortifying Provisions", 13, Rarity.COMMON, mage.cards.f.FortifyingProvisions.class));
        cards.add(new SetCardInfo("Foulmire Knight", 90, Rarity.UNCOMMON, mage.cards.f.FoulmireKnight.class));
        cards.add(new SetCardInfo("Frogify", 47, Rarity.UNCOMMON, mage.cards.f.Frogify.class));
        cards.add(new SetCardInfo("Gadwick, the Wizened", 48, Rarity.RARE, mage.cards.g.GadwickTheWizened.class));
        cards.add(new SetCardInfo("Garenbrig Carver", 156, Rarity.COMMON, mage.cards.g.GarenbrigCarver.class));
        cards.add(new SetCardInfo("Garenbrig Paladin", 157, Rarity.COMMON, mage.cards.g.GarenbrigPaladin.class));
        cards.add(new SetCardInfo("Garenbrig Squire", 158, Rarity.COMMON, mage.cards.g.GarenbrigSquire.class));
        cards.add(new SetCardInfo("Garrison Griffin", 305, Rarity.COMMON, mage.cards.g.GarrisonGriffin.class));
        cards.add(new SetCardInfo("Garruk, Cursed Huntsman", 191, Rarity.MYTHIC, mage.cards.g.GarrukCursedHuntsman.class));
        cards.add(new SetCardInfo("Giant Killer", 14, Rarity.RARE, mage.cards.g.GiantKiller.class));
        cards.add(new SetCardInfo("Giant Opportunity", 159, Rarity.UNCOMMON, mage.cards.g.GiantOpportunity.class));
        cards.add(new SetCardInfo("Giant's Skewer", 91, Rarity.COMMON, mage.cards.g.GiantsSkewer.class));
        cards.add(new SetCardInfo("Gilded Goose", 160, Rarity.RARE, mage.cards.g.GildedGoose.class));
        cards.add(new SetCardInfo("Gingerbread Cabin", 245, Rarity.COMMON, mage.cards.g.GingerbreadCabin.class));
        cards.add(new SetCardInfo("Gingerbrute", 219, Rarity.COMMON, mage.cards.g.Gingerbrute.class));
        cards.add(new SetCardInfo("Glass Casket", 15, Rarity.UNCOMMON, mage.cards.g.GlassCasket.class));
        cards.add(new SetCardInfo("Gluttonous Troll", 327, Rarity.RARE, mage.cards.g.GluttonousTroll.class));
        cards.add(new SetCardInfo("Golden Egg", 220, Rarity.COMMON, mage.cards.g.GoldenEgg.class));
        cards.add(new SetCardInfo("Grumgully, the Generous", 192, Rarity.UNCOMMON, mage.cards.g.GrumgullyTheGenerous.class));
        cards.add(new SetCardInfo("Happily Ever After", 16, Rarity.RARE, mage.cards.h.HappilyEverAfter.class));
        cards.add(new SetCardInfo("Harmonious Archon", 17, Rarity.MYTHIC, mage.cards.h.HarmoniousArchon.class));
        cards.add(new SetCardInfo("Henge Walker", 221, Rarity.COMMON, mage.cards.h.HengeWalker.class));
        cards.add(new SetCardInfo("Heraldic Banner", 222, Rarity.UNCOMMON, mage.cards.h.HeraldicBanner.class));
        cards.add(new SetCardInfo("Hypnotic Sprite", 49, Rarity.UNCOMMON, mage.cards.h.HypnoticSprite.class));
        cards.add(new SetCardInfo("Idyllic Grange", 246, Rarity.COMMON, mage.cards.i.IdyllicGrange.class));
        cards.add(new SetCardInfo("Improbable Alliance", 193, Rarity.UNCOMMON, mage.cards.i.ImprobableAlliance.class));
        cards.add(new SetCardInfo("Inquisitive Puppet", 223, Rarity.UNCOMMON, mage.cards.i.InquisitivePuppet.class));
        cards.add(new SetCardInfo("Insatiable Appetite", 162, Rarity.COMMON, mage.cards.i.InsatiableAppetite.class));
        cards.add(new SetCardInfo("Inspiring Veteran", 194, Rarity.UNCOMMON, mage.cards.i.InspiringVeteran.class));
        cards.add(new SetCardInfo("Into the Story", 50, Rarity.UNCOMMON, mage.cards.i.IntoTheStory.class));
        cards.add(new SetCardInfo("Irencrag Feat", 127, Rarity.RARE, mage.cards.i.IrencragFeat.class));
        cards.add(new SetCardInfo("Irencrag Pyromancer", 128, Rarity.RARE, mage.cards.i.IrencragPyromancer.class));
        cards.add(new SetCardInfo("Island", 254, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 255, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 256, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 257, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Joust", 129, Rarity.UNCOMMON, mage.cards.j.Joust.class));
        cards.add(new SetCardInfo("Jousting Dummy", 224, Rarity.COMMON, mage.cards.j.JoustingDummy.class));
        cards.add(new SetCardInfo("Keeper of Fables", 163, Rarity.UNCOMMON, mage.cards.k.KeeperOfFables.class));
        cards.add(new SetCardInfo("Kenrith, the Returned King", 303, Rarity.MYTHIC, mage.cards.k.KenrithTheReturnedKing.class));
        cards.add(new SetCardInfo("Knight of the Keep", 19, Rarity.COMMON, mage.cards.k.KnightOfTheKeep.class));
        cards.add(new SetCardInfo("Knights' Charge", 328, Rarity.RARE, mage.cards.k.KnightsCharge.class));
        cards.add(new SetCardInfo("Korvold, Fae-Cursed King", 329, Rarity.MYTHIC, mage.cards.k.KorvoldFaeCursedKing.class));
        cards.add(new SetCardInfo("Linden, the Steadfast Queen", 20, Rarity.RARE, mage.cards.l.LindenTheSteadfastQueen.class));
        cards.add(new SetCardInfo("Loch Dragon", 211, Rarity.UNCOMMON, mage.cards.l.LochDragon.class));
        cards.add(new SetCardInfo("Lochmere Serpent", 195, Rarity.RARE, mage.cards.l.LochmereSerpent.class));
        cards.add(new SetCardInfo("Locthwain Gargoyle", 225, Rarity.COMMON, mage.cards.l.LocthwainGargoyle.class));
        cards.add(new SetCardInfo("Locthwain Paladin", 93, Rarity.COMMON, mage.cards.l.LocthwainPaladin.class));
        cards.add(new SetCardInfo("Lonesome Unicorn", 21, Rarity.COMMON, mage.cards.l.LonesomeUnicorn.class));
        cards.add(new SetCardInfo("Lost Legion", 94, Rarity.COMMON, mage.cards.l.LostLegion.class));
        cards.add(new SetCardInfo("Lovestruck Beast", 165, Rarity.RARE, mage.cards.l.LovestruckBeast.class));
        cards.add(new SetCardInfo("Lucky Clover", 226, Rarity.UNCOMMON, mage.cards.l.LuckyClover.class));
        cards.add(new SetCardInfo("Mace of the Valiant", 314, Rarity.RARE, mage.cards.m.MaceOfTheValiant.class));
        cards.add(new SetCardInfo("Mad Ratter", 130, Rarity.UNCOMMON, mage.cards.m.MadRatter.class));
        cards.add(new SetCardInfo("Mantle of Tides", 52, Rarity.COMMON, mage.cards.m.MantleOfTides.class));
        cards.add(new SetCardInfo("Maraleaf Pixie", 196, Rarity.UNCOMMON, mage.cards.m.MaraleafPixie.class));
        cards.add(new SetCardInfo("Maraleaf Rider", 166, Rarity.COMMON, mage.cards.m.MaraleafRider.class));
        cards.add(new SetCardInfo("Merchant of the Vale", 131, Rarity.COMMON, mage.cards.m.MerchantOfTheVale.class));
        cards.add(new SetCardInfo("Midnight Clock", 54, Rarity.RARE, mage.cards.m.MidnightClock.class));
        cards.add(new SetCardInfo("Mirrormade", 55, Rarity.RARE, mage.cards.m.Mirrormade.class));
        cards.add(new SetCardInfo("Mistford River Turtle", 56, Rarity.COMMON, mage.cards.m.MistfordRiverTurtle.class));
        cards.add(new SetCardInfo("Mountain", 262, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 263, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 264, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 265, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Murderous Rider", 97, Rarity.RARE, mage.cards.m.MurderousRider.class));
        cards.add(new SetCardInfo("Mysterious Pathlighter", 22, Rarity.UNCOMMON, mage.cards.m.MysteriousPathlighter.class));
        cards.add(new SetCardInfo("Mystic Sanctuary", 247, Rarity.COMMON, mage.cards.m.MysticSanctuary.class));
        cards.add(new SetCardInfo("Mystical Dispute", 58, Rarity.UNCOMMON, mage.cards.m.MysticalDispute.class));
        cards.add(new SetCardInfo("Oakhame Adversary", 167, Rarity.UNCOMMON, mage.cards.o.OakhameAdversary.class));
        cards.add(new SetCardInfo("Oakhame Ranger", 212, Rarity.UNCOMMON, mage.cards.o.OakhameRanger.class));
        cards.add(new SetCardInfo("Oathsworn Knight", 98, Rarity.RARE, mage.cards.o.OathswornKnight.class));
        cards.add(new SetCardInfo("Ogre Errant", 132, Rarity.COMMON, mage.cards.o.OgreErrant.class));
        cards.add(new SetCardInfo("Oko's Accomplices", 310, Rarity.COMMON, mage.cards.o.OkosAccomplices.class));
        cards.add(new SetCardInfo("Oko's Hospitality", 312, Rarity.RARE, mage.cards.o.OkosHospitality.class));
        cards.add(new SetCardInfo("Oko, Thief of Crowns", 197, Rarity.MYTHIC, mage.cards.o.OkoThiefOfCrowns.class));
        cards.add(new SetCardInfo("Oko, the Trickster", 309, Rarity.MYTHIC, mage.cards.o.OkoTheTrickster.class));
        cards.add(new SetCardInfo("Once Upon a Time", 169, Rarity.RARE, mage.cards.o.OnceUponATime.class));
        cards.add(new SetCardInfo("Once and Future", 168, Rarity.UNCOMMON, mage.cards.o.OnceAndFuture.class));
        cards.add(new SetCardInfo("Opportunistic Dragon", 133, Rarity.RARE, mage.cards.o.OpportunisticDragon.class));
        cards.add(new SetCardInfo("Opt", 59, Rarity.COMMON, mage.cards.o.Opt.class));
        cards.add(new SetCardInfo("Order of Midnight", 99, Rarity.UNCOMMON, mage.cards.o.OrderOfMidnight.class));
        cards.add(new SetCardInfo("Outmuscle", 170, Rarity.COMMON, mage.cards.o.Outmuscle.class));
        cards.add(new SetCardInfo("Overwhelmed Apprentice", 60, Rarity.UNCOMMON, mage.cards.o.OverwhelmedApprentice.class));
        cards.add(new SetCardInfo("Piper of the Swarm", 100, Rarity.RARE, mage.cards.p.PiperOfTheSwarm.class));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 251, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 252, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 253, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Prized Griffin", 24, Rarity.COMMON, mage.cards.p.PrizedGriffin.class));
        cards.add(new SetCardInfo("Prophet of the Peak", 227, Rarity.COMMON, mage.cards.p.ProphetOfThePeak.class));
        cards.add(new SetCardInfo("Questing Beast", 171, Rarity.MYTHIC, mage.cards.q.QuestingBeast.class));
        cards.add(new SetCardInfo("Raging Redcap", 134, Rarity.COMMON, mage.cards.r.RagingRedcap.class));
        cards.add(new SetCardInfo("Rally for the Throne", 25, Rarity.UNCOMMON, mage.cards.r.RallyForTheThrone.class));
        cards.add(new SetCardInfo("Rampart Smasher", 213, Rarity.UNCOMMON, mage.cards.r.RampartSmasher.class));
        cards.add(new SetCardInfo("Rankle, Master of Pranks", 101, Rarity.MYTHIC, mage.cards.r.RankleMasterOfPranks.class));
        cards.add(new SetCardInfo("Realm-Cloaked Giant", 26, Rarity.MYTHIC, mage.cards.r.RealmCloakedGiant.class));
        cards.add(new SetCardInfo("Reave Soul", 103, Rarity.COMMON, mage.cards.r.ReaveSoul.class));
        cards.add(new SetCardInfo("Redcap Melee", 135, Rarity.UNCOMMON, mage.cards.r.RedcapMelee.class));
        cards.add(new SetCardInfo("Redcap Raiders", 136, Rarity.COMMON, mage.cards.r.RedcapRaiders.class));
        cards.add(new SetCardInfo("Resolute Rider", 214, Rarity.UNCOMMON, mage.cards.r.ResoluteRider.class));
        cards.add(new SetCardInfo("Return of the Wildspeaker", 172, Rarity.RARE, mage.cards.r.ReturnOfTheWildspeaker.class));
        cards.add(new SetCardInfo("Return to Nature", 173, Rarity.COMMON, mage.cards.r.ReturnToNature.class));
        cards.add(new SetCardInfo("Revenge of Ravens", 104, Rarity.UNCOMMON, mage.cards.r.RevengeOfRavens.class));
        cards.add(new SetCardInfo("Righteousness", 27, Rarity.UNCOMMON, mage.cards.r.Righteousness.class));
        cards.add(new SetCardInfo("Robber of the Rich", 138, Rarity.MYTHIC, mage.cards.r.RobberOfTheRich.class));
        cards.add(new SetCardInfo("Rosethorn Acolyte", 174, Rarity.COMMON, mage.cards.r.RosethornAcolyte.class));
        cards.add(new SetCardInfo("Rosethorn Halberd", 175, Rarity.COMMON, mage.cards.r.RosethornHalberd.class));
        cards.add(new SetCardInfo("Roving Keep", 228, Rarity.COMMON, mage.cards.r.RovingKeep.class));
        cards.add(new SetCardInfo("Rowan's Battleguard", 306, Rarity.UNCOMMON, mage.cards.r.RowansBattleguard.class));
        cards.add(new SetCardInfo("Rowan's Stalwarts", 307, Rarity.RARE, mage.cards.r.RowansStalwarts.class));
        cards.add(new SetCardInfo("Rowan, Fearless Sparkmage", 304, Rarity.MYTHIC, mage.cards.r.RowanFearlessSparkmage.class));
        cards.add(new SetCardInfo("Run Away Together", 62, Rarity.COMMON, mage.cards.r.RunAwayTogether.class));
        cards.add(new SetCardInfo("Sage of the Falls", 63, Rarity.UNCOMMON, mage.cards.s.SageOfTheFalls.class));
        cards.add(new SetCardInfo("Savvy Hunter", 200, Rarity.UNCOMMON, mage.cards.s.SavvyHunter.class));
        cards.add(new SetCardInfo("Scorching Dragonfire", 139, Rarity.COMMON, mage.cards.s.ScorchingDragonfire.class));
        cards.add(new SetCardInfo("Searing Barrage", 140, Rarity.COMMON, mage.cards.s.SearingBarrage.class));
        cards.add(new SetCardInfo("Seven Dwarves", 141, Rarity.COMMON, mage.cards.s.SevenDwarves.class));
        cards.add(new SetCardInfo("Shambling Suit", 230, Rarity.UNCOMMON, mage.cards.s.ShamblingSuit.class));
        cards.add(new SetCardInfo("Shepherd of the Flock", 28, Rarity.UNCOMMON, mage.cards.s.ShepherdOfTheFlock.class));
        cards.add(new SetCardInfo("Shimmer Dragon", 317, Rarity.RARE, mage.cards.s.ShimmerDragon.class));
        cards.add(new SetCardInfo("Shinechaser", 201, Rarity.UNCOMMON, mage.cards.s.Shinechaser.class));
        cards.add(new SetCardInfo("Shining Armor", 29, Rarity.COMMON, mage.cards.s.ShiningArmor.class));
        cards.add(new SetCardInfo("Silverflame Ritual", 30, Rarity.COMMON, mage.cards.s.SilverflameRitual.class));
        cards.add(new SetCardInfo("Silverflame Squire", 31, Rarity.COMMON, mage.cards.s.SilverflameSquire.class));
        cards.add(new SetCardInfo("Silverwing Squadron", 315, Rarity.RARE, mage.cards.s.SilverwingSquadron.class));
        cards.add(new SetCardInfo("Skullknocker Ogre", 142, Rarity.UNCOMMON, mage.cards.s.SkullknockerOgre.class));
        cards.add(new SetCardInfo("Slaying Fire", 143, Rarity.UNCOMMON, mage.cards.s.SlayingFire.class));
        cards.add(new SetCardInfo("Smitten Swordmaster", 105, Rarity.COMMON, mage.cards.s.SmittenSwordmaster.class));
        cards.add(new SetCardInfo("So Tiny", 64, Rarity.COMMON, mage.cards.s.SoTiny.class));
        cards.add(new SetCardInfo("Sorcerer's Broom", 232, Rarity.UNCOMMON, mage.cards.s.SorcerersBroom.class));
        cards.add(new SetCardInfo("Sorcerous Spyglass", 233, Rarity.RARE, mage.cards.s.SorcerousSpyglass.class));
        cards.add(new SetCardInfo("Specter's Shriek", 106, Rarity.UNCOMMON, mage.cards.s.SpectersShriek.class));
        cards.add(new SetCardInfo("Spinning Wheel", 234, Rarity.UNCOMMON, mage.cards.s.SpinningWheel.class));
        cards.add(new SetCardInfo("Sporecap Spider", 176, Rarity.COMMON, mage.cards.s.SporecapSpider.class));
        cards.add(new SetCardInfo("Steelbane Hydra", 322, Rarity.RARE, mage.cards.s.SteelbaneHydra.class));
        cards.add(new SetCardInfo("Steelclaw Lance", 202, Rarity.UNCOMMON, mage.cards.s.SteelclawLance.class));
        cards.add(new SetCardInfo("Steelgaze Griffin", 65, Rarity.COMMON, mage.cards.s.SteelgazeGriffin.class));
        cards.add(new SetCardInfo("Stolen by the Fae", 66, Rarity.RARE, mage.cards.s.StolenByTheFae.class));
        cards.add(new SetCardInfo("Stonecoil Serpent", 235, Rarity.RARE, mage.cards.s.StonecoilSerpent.class));
        cards.add(new SetCardInfo("Stormfist Crusader", 203, Rarity.RARE, mage.cards.s.StormfistCrusader.class));
        cards.add(new SetCardInfo("Swamp", 258, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 259, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 260, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 261, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Syr Alin, the Lion's Claw", 32, Rarity.UNCOMMON, mage.cards.s.SyrAlinTheLionsClaw.class));
        cards.add(new SetCardInfo("Syr Carah, the Bold", 145, Rarity.UNCOMMON, mage.cards.s.SyrCarahTheBold.class));
        cards.add(new SetCardInfo("Syr Elenora, the Discerning", 67, Rarity.UNCOMMON, mage.cards.s.SyrElenoraTheDiscerning.class));
        cards.add(new SetCardInfo("Syr Faren, the Hengehammer", 177, Rarity.UNCOMMON, mage.cards.s.SyrFarenTheHengehammer.class));
        cards.add(new SetCardInfo("Syr Gwyn, Hero of Ashvale", 330, Rarity.MYTHIC, mage.cards.s.SyrGwynHeroOfAshvale.class));
        cards.add(new SetCardInfo("Syr Konrad, the Grim", 107, Rarity.UNCOMMON, mage.cards.s.SyrKonradTheGrim.class));
        cards.add(new SetCardInfo("Tall as a Beanstalk", 178, Rarity.COMMON, mage.cards.t.TallAsABeanstalk.class));
        cards.add(new SetCardInfo("Taste of Death", 320, Rarity.RARE, mage.cards.t.TasteOfDeath.class));
        cards.add(new SetCardInfo("Tempting Witch", 108, Rarity.COMMON, mage.cards.t.TemptingWitch.class));
        cards.add(new SetCardInfo("The Cauldron of Eternity", 82, Rarity.MYTHIC, mage.cards.t.TheCauldronOfEternity.class));
        cards.add(new SetCardInfo("The Circle of Loyalty", 9, Rarity.MYTHIC, mage.cards.t.TheCircleOfLoyalty.class));
        cards.add(new SetCardInfo("The Great Henge", 161, Rarity.MYTHIC, mage.cards.t.TheGreatHenge.class));
        cards.add(new SetCardInfo("The Magic Mirror", 51, Rarity.MYTHIC, mage.cards.t.TheMagicMirror.class));
        cards.add(new SetCardInfo("The Royal Scions", 199, Rarity.MYTHIC, mage.cards.t.TheRoyalScions.class));
        cards.add(new SetCardInfo("Thorn Mammoth", 323, Rarity.RARE, mage.cards.t.ThornMammoth.class));
        cards.add(new SetCardInfo("Thornwood Falls", 313, Rarity.COMMON, mage.cards.t.ThornwoodFalls.class));
        cards.add(new SetCardInfo("Thrill of Possibility", 146, Rarity.COMMON, mage.cards.t.ThrillOfPossibility.class));
        cards.add(new SetCardInfo("Thunderous Snapper", 215, Rarity.UNCOMMON, mage.cards.t.ThunderousSnapper.class));
        cards.add(new SetCardInfo("Tome Raider", 68, Rarity.COMMON, mage.cards.t.TomeRaider.class));
        cards.add(new SetCardInfo("Tome of Legends", 332, Rarity.RARE, mage.cards.t.TomeOfLegends.class));
        cards.add(new SetCardInfo("Torbran, Thane of Red Fell", 147, Rarity.RARE, mage.cards.t.TorbranThaneOfRedFell.class));
        cards.add(new SetCardInfo("Tournament Grounds", 248, Rarity.UNCOMMON, mage.cards.t.TournamentGrounds.class));
        cards.add(new SetCardInfo("Trail of Crumbs", 179, Rarity.UNCOMMON, mage.cards.t.TrailOfCrumbs.class));
        cards.add(new SetCardInfo("Trapped in the Tower", 33, Rarity.COMMON, mage.cards.t.TrappedInTheTower.class));
        cards.add(new SetCardInfo("True Love's Kiss", 34, Rarity.COMMON, mage.cards.t.TrueLovesKiss.class));
        cards.add(new SetCardInfo("Tuinvale Treefolk", 180, Rarity.COMMON, mage.cards.t.TuinvaleTreefolk.class));
        cards.add(new SetCardInfo("Turn into a Pumpkin", 69, Rarity.UNCOMMON, mage.cards.t.TurnIntoAPumpkin.class));
        cards.add(new SetCardInfo("Unexplained Vision", 70, Rarity.COMMON, mage.cards.u.UnexplainedVision.class));
        cards.add(new SetCardInfo("Vantress Gargoyle", 71, Rarity.RARE, mage.cards.v.VantressGargoyle.class));
        cards.add(new SetCardInfo("Vantress Paladin", 72, Rarity.COMMON, mage.cards.v.VantressPaladin.class));
        cards.add(new SetCardInfo("Venerable Knight", 35, Rarity.UNCOMMON, mage.cards.v.VenerableKnight.class));
        cards.add(new SetCardInfo("Wandermare", 204, Rarity.UNCOMMON, mage.cards.w.Wandermare.class));
        cards.add(new SetCardInfo("Weaselback Redcap", 148, Rarity.COMMON, mage.cards.w.WeaselbackRedcap.class));
        cards.add(new SetCardInfo("Wicked Guardian", 109, Rarity.COMMON, mage.cards.w.WickedGuardian.class));
        cards.add(new SetCardInfo("Wicked Wolf", 181, Rarity.RARE, mage.cards.w.WickedWolf.class));
        cards.add(new SetCardInfo("Wildborn Preserver", 182, Rarity.RARE, mage.cards.w.WildbornPreserver.class));
        cards.add(new SetCardInfo("Wildwood Tracker", 183, Rarity.COMMON, mage.cards.w.WildwoodTracker.class));
        cards.add(new SetCardInfo("Wind-Scarred Crag", 308, Rarity.COMMON, mage.cards.w.WindScarredCrag.class));
        cards.add(new SetCardInfo("Wintermoor Commander", 205, Rarity.UNCOMMON, mage.cards.w.WintermoorCommander.class));
        cards.add(new SetCardInfo("Wishclaw Talisman", 110, Rarity.RARE, mage.cards.w.WishclawTalisman.class));
        cards.add(new SetCardInfo("Wishful Merfolk", 73, Rarity.COMMON, mage.cards.w.WishfulMerfolk.class));
        cards.add(new SetCardInfo("Witch's Cottage", 249, Rarity.COMMON, mage.cards.w.WitchsCottage.class));
        cards.add(new SetCardInfo("Witch's Oven", 237, Rarity.UNCOMMON, mage.cards.w.WitchsOven.class));
        cards.add(new SetCardInfo("Witch's Vengeance", 111, Rarity.RARE, mage.cards.w.WitchsVengeance.class));
        cards.add(new SetCardInfo("Witching Well", 74, Rarity.COMMON, mage.cards.w.WitchingWell.class));
        cards.add(new SetCardInfo("Wolf's Quarry", 184, Rarity.COMMON, mage.cards.w.WolfsQuarry.class));
        cards.add(new SetCardInfo("Workshop Elders", 318, Rarity.RARE, mage.cards.w.WorkshopElders.class));
        cards.add(new SetCardInfo("Worthy Knight", 36, Rarity.RARE, mage.cards.w.WorthyKnight.class));
        cards.add(new SetCardInfo("Yorvo, Lord of Garenbrig", 185, Rarity.RARE, mage.cards.y.YorvoLordOfGarenbrig.class));
        cards.add(new SetCardInfo("Youthful Knight", 37, Rarity.COMMON, mage.cards.y.YouthfulKnight.class));

        // This is here to prevent the incomplete adventure implementation from causing problems and will be removed
        cards.removeIf(setCardInfo -> AdventureCard.class.isAssignableFrom(setCardInfo.getCardClass()));
    }
}
