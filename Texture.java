import java.awt.*;

public class Texture{

    //==============
    //Custom textures
    //METAL#
    //WOOD#
    //VINE#
    //SAND#
    //DIRT#
    //WATER#
    //OIL#
    //VAPOR#
    //Neon#
    //GRASS#
    //DESTRUCTOR#
    //GENERATOR#

   public static final Color[][] METAL_TEXTURE = {
      {new Color (167,167,167),new Color (192,192,192)},
      {new Color (192,192,192),new Color (134,134,134)},
      };

   public static final Color[][] WOOD_TEXTURE = {
      {new Color (180,116,70),new Color (180,116,70),new Color (180,116,70),new Color (177,112,66),new Color (177,112,66),new Color (180,116,70),new Color (180,116,70),new Color (180,116,70)},
      {new Color (178,113,67),new Color (178,113,67),new Color (178,113,67),new Color (172,110,64),new Color (172,110,64),new Color (176,112,65),new Color (177,112,66),new Color (177,112,66)},
      {new Color (180,116,70),new Color (180,116,70),new Color (173,110,65),new Color (160,102,60),new Color (160,102,60),new Color (173,110,65),new Color (178,113,66),new Color (178,113,67)},
      {new Color (182,118,72),new Color (182,118,72),new Color (177,114,69),new Color (162,104,62),new Color (162,104,62),new Color (177,114,69),new Color (182,118,72),new Color (182,118,72)},
      {new Color (176,114,68),new Color (181,118,73),new Color (180,117,72),new Color (176,114,70),new Color (176,114,70),new Color (180,117,72),new Color (176,114,68),new Color (176,114,68)},
      {new Color (179,116,71),new Color (179,116,71),new Color (179,116,71),new Color (182,119,73),new Color (182,119,73),new Color (182,119,73),new Color (182,119,73),new Color (182,119,73)},
      {new Color (180,116,71),new Color (180,116,71),new Color (180,116,71),new Color (180,116,71),new Color (180,116,71),new Color (176,114,68),new Color (176,114,68),new Color (176,114,68)},
      {new Color (179,114,68),new Color (179,114,68),new Color (179,114,68),new Color (178,113,67),new Color (181,118,73),new Color (181,118,73),new Color (181,118,73),new Color (181,118,73)},
      };

   public static final Color[][] VINE_TEXTURE = {
      {new Color (47,154,47),new Color (36,150,36),new Color (35,150,35),new Color (34,148,34),new Color (40,150,40),new Color (58,157,58),new Color (71,163,71),new Color (54,156,54)},
      {new Color (52,154,52),new Color (43,149,43),new Color (42,150,42),new Color (48,152,48),new Color (55,156,55),new Color (64,160,64),new Color (73,164,73),new Color (46,151,46)},
      {new Color (51,155,51),new Color (57,155,57),new Color (61,156,61),new Color (61,156,61),new Color (54,156,54),new Color (56,158,56),new Color (46,151,46),new Color (29,148,29)},
      {new Color (55,157,55),new Color (54,156,54),new Color (46,151,46),new Color (40,148,40),new Color (39,149,39),new Color (47,154,47),new Color (42,153,42),new Color (38,151,38)},
      {new Color (49,154,49),new Color (41,152,41),new Color (25,146,25),new Color (19,145,19),new Color (29,148,29),new Color (41,151,41),new Color (35,149,35),new Color (35,151,35)},
      {new Color (44,151,44),new Color (35,149,35),new Color (29,147,29),new Color (26,147,26),new Color (24,148,24),new Color (32,150,32),new Color (34,150,34),new Color (39,149,39)},
      {new Color (30,146,30),new Color (29,145,29),new Color (37,148,37),new Color (28,146,28),new Color (17,146,17),new Color (39,149,39),new Color (56,158,56),new Color (39,149,39)},
      {new Color (19,144,19),new Color (20,142,20),new Color (28,145,28),new Color (22,145,22),new Color (39,149,39),new Color (49,155,49),new Color (71,163,71),new Color (41,153,41)},
      };

   public static final Color[][] SAND_TEXTURE = {
      {new Color (194,177,139),new Color (200,169,130),new Color (206,174,127),new Color (200,171,134),new Color (196,172,138),new Color (199,170,132),new Color (199,173,118),new Color (198,178,113)},
      {new Color (200,173,132),new Color (202,168,135),new Color (207,175,140),new Color (200,175,132),new Color (200,173,128),new Color (199,176,126),new Color (199,179,127),new Color (195,178,131)},
      {new Color (199,174,118),new Color (201,176,128),new Color (200,177,139),new Color (194,177,142),new Color (195,179,139),new Color (198,178,127),new Color (198,172,126),new Color (198,177,125)},
      {new Color (192,183,131),new Color (199,176,135),new Color (196,174,138),new Color (194,181,139),new Color (189,181,137),new Color (192,182,131),new Color (189,182,131),new Color (189,181,126)},
      {new Color (192,179,134),new Color (197,180,136),new Color (190,179,128),new Color (193,176,119),new Color (193,173,125),new Color (196,183,128),new Color (191,185,120),new Color (190,180,130)},
      {new Color (192,179,140),new Color (195,184,143),new Color (193,181,135),new Color (198,176,131),new Color (195,176,126),new Color (194,176,120),new Color (192,173,123),new Color (193,171,131)},
      {new Color (191,176,135),new Color (191,181,139),new Color (192,176,135),new Color (196,178,139),new Color (192,175,126),new Color (194,173,112),new Color (188,169,122),new Color (189,171,138)},
      {new Color (192,179,111),new Color (193,181,128),new Color (196,178,136),new Color (196,176,132),new Color (195,171,121),new Color (199,177,117),new Color (193,178,123),new Color (190,173,142)},
      };

   public static final Color[][] DIRT_TEXTURE = {
      {new Color (148,110,72),new Color (145,107,70),new Color (148,110,72),new Color (155,118,83),new Color (152,113,76),new Color (155,118,83),new Color (157,121,89),new Color (156,120,88)},
      {new Color (145,107,70),new Color (141,99,52),new Color (145,107,70),new Color (148,110,72),new Color (153,116,79),new Color (158,122,89),new Color (160,125,93),new Color (158,122,90)},
      {new Color (148,110,72),new Color (145,107,70),new Color (148,110,72),new Color (154,117,83),new Color (154,117,82),new Color (159,124,91),new Color (160,125,93),new Color (157,121,88)},
      {new Color (154,116,80),new Color (148,110,72),new Color (153,116,82),new Color (149,113,79),new Color (151,113,77),new Color (156,120,85),new Color (159,123,90),new Color (160,125,94)},
      {new Color (154,117,82),new Color (156,119,84),new Color (158,123,91),new Color (150,113,76),new Color (149,110,70),new Color (154,117,81),new Color (156,119,85),new Color (158,122,89)},
      {new Color (156,120,86),new Color (156,120,87),new Color (157,121,89),new Color (160,125,93),new Color (150,111,72),new Color (156,119,85),new Color (158,123,90),new Color (156,119,85)},
      {new Color (155,119,86),new Color (156,120,87),new Color (160,125,93),new Color (157,121,89),new Color (150,111,73),new Color (157,121,88),new Color (153,116,82),new Color (150,111,72)},
      {new Color (156,121,89),new Color (154,118,84),new Color (155,118,83),new Color (153,116,80),new Color (154,117,82),new Color (153,116,82),new Color (150,111,72),new Color (149,110,70)},
      };
      

   public static final Color[][] WATER_TEXTURE = {
      {new Color (0,0,203),new Color (0,0,209),new Color (0,0,233),new Color (0,0,233),new Color (0,0,214),new Color (0,0,214),new Color (0,0,223),new Color (0,0,231)},
      {new Color (0,0,223),new Color (0,0,210),new Color (0,0,222),new Color (0,0,233),new Color (0,0,223),new Color (0,0,217),new Color (0,0,222),new Color (0,0,234)},
      {new Color (0,0,240),new Color (0,0,218),new Color (0,0,217),new Color (0,0,234),new Color (0,0,231),new Color (0,0,210),new Color (0,0,210),new Color (0,0,225)},
      {new Color (0,0,242),new Color (0,0,226),new Color (0,0,226),new Color (0,0,239),new Color (0,0,226),new Color (0,0,206),new Color (0,0,209),new Color (0,0,220)},
      {new Color (0,0,234),new Color (0,0,226),new Color (0,0,217),new Color (0,0,229),new Color (0,0,226),new Color (0,0,215),new Color (0,0,215),new Color (0,0,218)},
      {new Color (0,0,215),new Color (0,0,218),new Color (0,0,207),new Color (0,0,223),new Color (0,0,228),new Color (0,0,225),new Color (0,0,218),new Color (0,0,201)},
      {new Color (0,0,195),new Color (0,0,201),new Color (0,0,204),new Color (0,0,217),new Color (0,0,214),new Color (0,0,212),new Color (0,0,209),new Color (0,0,195)},
      {new Color (0,0,198),new Color (0,0,201),new Color (0,0,214),new Color (0,0,207),new Color (0,0,187),new Color (0,0,182),new Color (0,0,185),new Color (0,0,188)},
      };

  
   public static final Color[][] OIL_TEXTURE = {
      {new Color (254,173,10),new Color (255,186,44),new Color (254,176,71),new Color (251,181,70),new Color (254,182,24),new Color (255,188,8),new Color (254,185,7),new Color (253,180,30)},
      {new Color (251,175,2),new Color (253,184,18),new Color (255,176,37),new Color (253,182,48),new Color (255,174,14),new Color (255,179,13),new Color (253,185,2),new Color (249,182,12)},
      {new Color (253,178,6),new Color (250,175,40),new Color (254,170,67),new Color (252,180,46),new Color (254,181,23),new Color (254,185,53),new Color (255,188,18),new Color (254,181,6)},
      {new Color (252,183,2),new Color (254,171,18),new Color (250,175,24),new Color (249,180,33),new Color (254,181,34),new Color (251,180,57),new Color (254,178,34),new Color (253,179,14)},
      {new Color (254,172,12),new Color (254,178,3),new Color (249,179,8),new Color (253,176,25),new Color (255,173,10),new Color (254,175,16),new Color (253,161,9),new Color (252,175,16)},
      {new Color (252,168,46),new Color (254,175,18),new Color (253,183,26),new Color (248,181,34),new Color (253,171,7),new Color (255,177,3),new Color (255,170,22),new Color (252,178,38)},
      {new Color (254,160,20),new Color (254,179,29),new Color (251,171,34),new Color (253,182,69),new Color (255,171,27),new Color (255,179,30),new Color (255,172,63),new Color (253,176,73)},
      {new Color (247,180,14),new Color (252,189,30),new Color (252,180,60),new Color (255,177,39),new Color (255,170,40),new Color (255,178,67),new Color (255,177,40),new Color (255,174,36)},
      };

   public static final Color[][] VAPOR_TEXTURE = {
      {new Color (254,243,252),new Color (254,252,254),new Color (251,248,254),new Color (253,253,255),new Color (255,249,253),new Color (255,254,253),new Color (255,251,254),new Color (253,253,255)},
      {new Color (247,254,252),new Color (252,255,253),new Color (252,254,254),new Color (255,253,254),new Color (255,249,254),new Color (255,254,255),new Color (255,254,255),new Color (255,252,254)},
      {new Color (254,255,254),new Color (254,254,254),new Color (254,251,253),new Color (254,252,247),new Color (255,254,252),new Color (255,254,255),new Color (254,254,255),new Color (254,254,255)},
      {new Color (255,255,253),new Color (251,254,249),new Color (250,247,254),new Color (251,253,254),new Color (254,253,255),new Color (254,252,255),new Color (254,254,254),new Color (250,254,255)},
      {new Color (254,253,255),new Color (251,255,253),new Color (252,254,252),new Color (253,252,255),new Color (254,254,255),new Color (250,254,252),new Color (254,253,249),new Color (254,249,254)},
      {new Color (253,254,254),new Color (252,254,254),new Color (254,254,251),new Color (253,255,254),new Color (254,255,255),new Color (253,254,255),new Color (255,254,254),new Color (254,254,255)},
      {new Color (250,248,251),new Color (253,250,253),new Color (250,250,254),new Color (253,254,254),new Color (251,254,255),new Color (252,251,255),new Color (254,254,255),new Color (251,254,254)},
      {new Color (250,249,254),new Color (250,254,254),new Color (251,254,252),new Color (254,255,246),new Color (253,255,254),new Color (254,255,255),new Color (255,254,255),new Color (254,252,253)},
      };

   public static final Color[][] NEON_TEXTURE = {
      {new Color (242,1,1),new Color (253,4,4),new Color (254,6,6),new Color (255,16,16),new Color (254,21,21),new Color (254,8,8),new Color (241,0,0),new Color (240,0,0)},
      {new Color (235,0,0),new Color (251,2,2),new Color (240,1,1),new Color (254,7,7),new Color (247,2,2),new Color (255,9,9),new Color (251,2,2),new Color (244,1,1)},
      {new Color (250,2,2),new Color (254,5,5),new Color (254,11,11),new Color (247,1,1),new Color (243,0,0),new Color (254,10,10),new Color (255,8,8),new Color (254,8,8)},
      {new Color (230,0,0),new Color (247,2,2),new Color (255,18,18),new Color (252,3,3),new Color (243,0,0),new Color (246,1,1),new Color (251,2,2),new Color (255,16,16)},
      {new Color (247,1,1),new Color (254,12,12),new Color (255,23,23),new Color (254,13,13),new Color (245,2,2),new Color (254,14,14),new Color (255,6,6),new Color (254,8,8)},
      {new Color (254,17,17),new Color (255,10,10),new Color (255,32,32),new Color (255,11,11),new Color (254,16,16),new Color (250,3,3),new Color (254,13,13),new Color (243,2,2)},
      {new Color (253,6,6),new Color (255,11,11),new Color (254,11,11),new Color (247,2,2),new Color (254,7,7),new Color (254,15,15),new Color (254,11,11),new Color (254,13,13)},
      {new Color (240,1,1),new Color (254,11,11),new Color (251,2,2),new Color (253,10,10),new Color (236,1,1),new Color (245,1,1),new Color (242,1,1),new Color (236,1,1)},
      };
  
   public static final Color[][] GRASS_TEXTURE = {
      {new Color (21,255,21),new Color (0,239,0),new Color (0,235,0),new Color (2,242,2),new Color (0,225,0),new Color (6,246,6),new Color (0,236,0),new Color (17,255,17)},
      {new Color (14,254,14),new Color (3,243,3),new Color (5,245,5),new Color (7,247,7),new Color (0,229,0),new Color (8,248,8),new Color (13,253,13),new Color (0,238,0)},
      {new Color (0,232,0),new Color (0,227,0),new Color (0,239,0),new Color (4,244,4),new Color (0,236,0),new Color (13,253,13),new Color (7,247,7),new Color (0,235,0)},
      {new Color (0,234,0),new Color (11,250,11),new Color (0,225,0),new Color (15,255,15),new Color (0,231,0),new Color (4,244,4),new Color (6,246,6),new Color (17,255,17)},
      {new Color (0,225,0),new Color (0,234,0),new Color (28,255,28),new Color (0,229,0),new Color (0,223,0),new Color (2,242,2),new Color (0,227,0),new Color (7,247,7)},
      {new Color (3,243,3),new Color (0,237,0),new Color (17,255,17),new Color (0,220,0),new Color (2,242,2),new Color (5,245,5),new Color (12,252,12),new Color (0,236,0)},
      {new Color (4,244,4),new Color (0,231,0),new Color (24,255,24),new Color (9,249,9),new Color (0,216,0),new Color (0,237,0),new Color (19,255,19),new Color (2,242,2)},
      {new Color (15,255,15),new Color (1,241,1),new Color (0,239,0),new Color (0,229,0),new Color (0,238,0),new Color (12,252,12),new Color (23,255,23),new Color (13,253,13)},
      };
  
   public static final Color[][] GENERATOR_TEXTURE = {
      {new Color (252,174,174),new Color (253,176,176),new Color (254,177,177),new Color (254,175,175),new Color (254,177,177),new Color (252,172,172),new Color (254,174,174),new Color (252,171,171)},
      {new Color (253,179,179),new Color (252,174,174),new Color (254,178,178),new Color (253,173,173),new Color (254,175,175),new Color (254,175,175),new Color (254,174,174),new Color (253,174,174)},
      {new Color (251,173,173),new Color (253,174,174),new Color (253,173,173),new Color (253,171,171),new Color (253,173,173),new Color (254,175,175),new Color (254,175,175),new Color (253,176,176)},
      {new Color (254,183,183),new Color (254,179,179),new Color (252,171,171),new Color (252,169,169),new Color (252,171,171),new Color (253,175,175),new Color (254,179,179),new Color (254,176,176)},
      {new Color (254,177,177),new Color (255,180,180),new Color (254,176,176),new Color (253,173,173),new Color (253,176,176),new Color (254,181,181),new Color (253,177,177),new Color (254,174,174)},
      {new Color (252,172,172),new Color (254,179,179),new Color (255,180,180),new Color (254,178,178),new Color (252,173,173),new Color (253,175,175),new Color (254,177,177),new Color (252,172,172)},
      {new Color (253,172,172),new Color (254,175,175),new Color (255,178,178),new Color (255,182,182),new Color (253,174,174),new Color (253,172,172),new Color (254,176,176),new Color (252,171,171)},
      {new Color (253,177,177),new Color (254,180,180),new Color (255,180,180),new Color (254,179,179),new Color (253,173,173),new Color (252,172,172),new Color (253,176,176),new Color (253,172,172)},
      };

   public static final Color[][] DESTRUCTOR_TEXTURE = {
      {new Color (56,254,254),new Color (20,252,252),new Color (35,254,254),new Color (43,254,254),new Color (65,255,255),new Color (72,254,254),new Color (50,254,254),new Color (13,251,251)},
      {new Color (33,250,250),new Color (8,249,249),new Color (24,254,254),new Color (25,251,251),new Color (44,254,254),new Color (33,253,253),new Color (51,255,255),new Color (29,254,254)},
      {new Color (28,249,249),new Color (18,253,253),new Color (37,255,255),new Color (54,254,254),new Color (21,253,253),new Color (14,252,252),new Color (51,254,254),new Color (49,255,255)},
      {new Color (50,253,253),new Color (14,248,248),new Color (30,253,253),new Color (68,255,255),new Color (36,255,255),new Color (8,252,252),new Color (25,253,253),new Color (32,255,255)},
      {new Color (16,251,251),new Color (27,253,253),new Color (58,255,255),new Color (81,255,255),new Color (61,255,255),new Color (34,253,253),new Color (59,254,254),new Color (46,255,255)},
      {new Color (36,252,252),new Color (65,255,255),new Color (60,255,255),new Color (89,255,255),new Color (59,255,255),new Color (63,255,255),new Color (41,254,254),new Color (58,255,255)},
      {new Color (81,254,254),new Color (49,254,254),new Color (56,255,255),new Color (57,255,255),new Color (32,254,254),new Color (47,254,254),new Color (61,255,255),new Color (58,254,254)},
      {new Color (27,250,250),new Color (22,251,251),new Color (56,254,254),new Color (32,254,254),new Color (48,254,254),new Color (22,250,250),new Color (28,253,253),new Color (18,252,252)},
      };
}